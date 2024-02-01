package level2.exam50_59;

import java.util.Stack;

/*
 * 문제 이름 : 택배상자
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/131704
 * */
public class exam51 {

    // 나의 풀이
    public int solution(int[] order) {
        Stack<Integer> belt = new Stack<>();
        int answer = 0;

        for(int i=1;i<=order.length;i++) {
            belt.push(i);

            if(i == order[answer]) {
                while (!belt.isEmpty() && belt.peek() == order[answer]) {
                    answer++;
                    belt.pop();
                }
            }
        }

        return answer;
    }

    //남의 풀이
    /*
    public int solution(int[] order) {
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < order.length; i++){
            stack.push(i+1);
            while(!stack.isEmpty()){
                if (stack.peek() == order[idx]){
                    stack.pop();
                    idx++;
                } else break;
            }
        }

        return idx;
    }
     */

}
