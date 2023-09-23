package level2.exam10_19;

import java.util.Stack;

/*
 * 문제 이름 : 괄호 회전하기
 * 문제 설명 : 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
			(), [], {} 는 모두 올바른 괄호 문자열입니다.
			만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
			만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
			대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/76502
 * */
public class exam18 {

	// 내 풀이
	public int solution(String s) {
        int answer = 0;
        
        for(int i=0;i<s.length();i++) {
            s = s.substring(1) + String.valueOf(s.charAt(0));
            
            if(checkString(s)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean checkString(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else if(c == ')' || c == ']' || c == '}') {
                if(!stack.isEmpty()) {
                    switch (c) {
                        case ')':
                            removeString(stack, '(');
                            break;
                        case ']':
                            removeString(stack, '[');
                            break;
                        case '}':
                            removeString(stack, '{');
                            break;
                    }
                }else {
                    return false;
                }
            }
        }
        
        if(stack.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public void removeString(Stack<Character> stack, char c) {
        if(stack.peek() == c) {
            stack.pop();
        }
    }
	
	// 남의 풀이
	/* public int solution(String s) {
        int answer = 0;
        int strLen = s.length();

        for(int i = 0; i < strLen; i++)
            answer += cal(s, i, strLen);

        return answer;
    }

    public int cal(String s, int strtIdx, int strLen){
        int ret = 0;
        Stack<Character> st = new Stack<>();

        for(int i = strtIdx; i < strtIdx + strLen; i++){
            int idx = i % strLen;
            char c = s.charAt(idx);

            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(st.empty())
                    return 0;
                else if((st.peek() != '(' && c == ')') || (st.peek() != '{' && c == '}') || (st.peek() != '[' && c == ']'))
                    return 0;
                else
                    st.pop();
            }
        }

        if(!st.empty())
            return 0;

        return 1;
    } */

}
