package level2.exam40_49;

import java.util.Arrays;
import java.util.Stack;

/*
 * 문제 이름 : 뒤에 있는 큰 수 찾기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/154539
 * */
public class exam42 {

	// 내 풀이
	public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<numbers.length;i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
		
	
	// 남의 풀이
	/* public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i = 1; i < numbers.length; i++){
            while(!s.isEmpty()){
                int idx = s.pop();
                if(numbers[i] > numbers[idx]){ // 뒤가 더 클때
                    answer[idx] = numbers[i];
                } else { // 앞이 더 크거나 같을 때
                    s.push(idx);
                    break;
                } 
            }
            s.push(i);
        }

        return answer;
    } */

}
