package level0_1.exam30_39;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열의 원소만큼 추가하기
 * 문제 설명 : 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번에 대해서 a와 X를 나타내보면 다음 표와 같습니다. 따라서 [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]를 return 합니다.
 * 입출력 예 : 예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다. 따라서 [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181861
 * 
 * */
public class exam31 {

	// 내 풀이
	public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i];j++) {
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
	    String answer = "";

        for(int i: arr) {
            answer += (String.valueOf(i)+",").repeat(i);
        }
        return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray(); 
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
        return Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
    } */

}
