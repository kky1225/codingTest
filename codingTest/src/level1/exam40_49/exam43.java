package level1.exam40_49;

import java.util.Arrays;
import java.util.HashSet;

/*
 * 문제 이름 : K번째수
 * 문제 설명 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다. 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면 array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
			1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다. 2에서 나온 배열의 3번째 숫자는 5입니다. 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * 입출력 예 : [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다. [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다. [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * 
 * */
public class exam43 {

	// 내 풀이
	public int[] solution(int[] numbers) {
		Arrays.sort(numbers);
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0;i<numbers.length-1;i++) 
            for(int j=i+1;j<numbers.length;j++) 
                if(i != j)
                    hs.add(numbers[i] + numbers[j]);
        
        int[] answer = new int[hs.size()];
        int index = 0;
        
        for(int i : hs) {
            answer[index] = i;
            index += 1;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] numbers) {
	    Set<Integer> sumNumber = new TreeSet();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumber.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumNumber.size()];
        int index = 0;
        Iterator itor = sumNumber.iterator();
        while(itor.hasNext()){
            answer[index] = (int)itor.next();
            index++;
        }

        return answer;
	} */
	
}
