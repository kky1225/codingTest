package level0_1.exam100_125;

import java.util.Stack;

/*
 * 문제 이름 : 배열 만들기 4
 * 문제 설명 : 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다. 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
			만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다. stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다. stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
			위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181918
 * 
 * */
public class exam106 {

	// 내 풀이
	public int[] solution(int[] arr) {
        int i = 0;
        
        Stack<Integer> stkStack = new Stack<>();
        
        while(i < arr.length) {
            if(stkStack.size() == 0) {
                stkStack.push(arr[i++]);
            }else if(stkStack.peek() < arr[i]) {
                stkStack.push(arr[i++]);
            }else if(stkStack.peek() >= arr[i]) {
                stkStack.pop();
            }
        }
        
        int[] stk = new int[stkStack.size()];
        int index = stkStack.size() - 1;
        
        while(!stkStack.isEmpty()) {
            stk[index--] = stkStack.peek();
            stkStack.pop();
        }
        
        return stk;
    }
	
	// 남의 풀이
	/* public int[] solution(String my_string) {
	    ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (arrayList.isEmpty()) {
                arrayList.add(arr[i]);
                i += 1;
            } else if (arrayList.get(arrayList.size() - 1) < arr[i]) {
                arrayList.add(arr[i]);
                i += 1;
            } else if (arrayList.get(arrayList.size() - 1) >= arr[i]) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        int idx = 0;
        int[] stk = new int[arrayList.size()];
        for (int data : arrayList)
            stk[idx++] = data;
        return stk;
	} */
	
}
