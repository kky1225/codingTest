package level0_1.exam100_125;

import java.util.Stack;

/*
 * 문제 이름 : 배열 만들기 6
 * 문제 설명 : 0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다. i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
			만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
			stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
			stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
			위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요. 단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181859
 * 
 * */
public class exam116 {

	// 내 풀이
	public int[] solution(int[] arr) {
        Stack<Integer> stkStack = new Stack<>();
        int i = 0;
        
        while(i < arr.length) {
            if(stkStack.size() == 0) {
                stkStack.push(arr[i]);
            }else if(stkStack.size() > 0 && stkStack.peek() == arr[i]) {
                stkStack.pop();
            }else if(stkStack.size() > 0 && stkStack.peek() != arr[i]) {
                stkStack.push(arr[i]);
            }
            
            i++;
        }
        
        if(stkStack.size() == 0) {
            int[] stk = {-1};
            return stk;
        }
        
        return stkStack.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public String[] solution(String[] picture, int k) {
	    Stack<Integer> stack = new Stack<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) {
                stack.pop();
            } else {
                stack.push(no);
            }
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
	} */
	
}
