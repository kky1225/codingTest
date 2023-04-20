package level1.exam10_19;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 제일 작은 수 제거하기
 * 문제 설명 : 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * 입출력 예 : [4,3,2,1] : [4,3,2]
 * 입출력 예 : [10] : [-1]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * 
 * */
public class exam19 {

	// 내 풀이
	public int[] solution(int[] arr) {
		int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        
        if(arr.length > 1) {
            int min = arr[0];
            int index = 0;
        
            for(int i=0; i<arr.length; i++) {
                arrList.add(arr[i]);
            
                if(min > arr[i]) {
                    min = arr[i];
                    index = i;
                }
            }
        
            arrList.remove(index);
            
            answer = new int[arr.length - 1];
        
            for(int i=0; i<arrList.size(); i++){
                answer[i] = arrList.get(i);
            }
            
        }else{
            answer = new int[1];
            
            answer[0] = -1;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
	    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        if (list.size() <= 0) return new int[]{-1};
        return list.stream().mapToInt(i->i).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
	    if (arr.length <= 1) return new int[]{ -1 };
      	int min = Arrays.stream(arr).min().getAsInt();
      	return Arrays.stream(arr).filter(i -> i != min).toArray();
	} */
	
}
