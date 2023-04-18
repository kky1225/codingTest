package level1.exam10_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 문제 이름 : 나누어 떨어지는 숫자 배열
 * 문제 설명 : array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요. divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 * 입출력 예 : arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
 * 입출력 예 : arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * 
 * */
public class exam16 {

	// 내 풀이
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++)
            if(arr[i] % divisor == 0)
                list.add(arr[i]);
        
        int[] answer = {};
        
        if(list.size() > 0){
            answer = new int[list.size()];
        
            for(int i=0; i<list.size(); i++){
                answer[i] = (int) list.get(i);
            }
        }else{
            answer = new int[1];
            
            answer[0] = -1;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int divisor) {
	    return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
    } */
	
}
