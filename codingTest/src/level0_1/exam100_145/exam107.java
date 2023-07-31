package level0_1.exam100_145;

import java.math.BigInteger;

/*
 * 문제 이름 : 두 수의 합
 * 문제 설명 : 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181846
 * 
 * */
public class exam107 {

	// 내 풀이
	public String solution(String a, String b) {
        BigInteger biA = new BigInteger(a);
        BigInteger biB = new BigInteger(b);
        
        return biA.add(biB).toString();
    }
	
	// 남의 풀이
	/* public String solution(String a, String b) {
	    String answer = "";
        Stack<Integer> stack = new Stack<>();
        String tmp = "";

        int shortLen = Math.min(a.length(), b.length());
        int longLen = Math.max(a.length(), b.length());

        if (a.length() != b.length()) {
            if (shortLen == a.length()) {
                for (int i = shortLen; i < longLen; i++) {
                    tmp += "0";
                }
                a = tmp + a;
            } else {
                for (int i = shortLen; i < longLen; i++) {
                    tmp += "0";
                }
                b = tmp + b;
            }
        }

        boolean carry = false;
        int sumNum = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int NumA = Integer.parseInt(String.valueOf(a.charAt(i)));
            int NumB = Integer.parseInt(String.valueOf(b.charAt(i)));

            if (carry) {
                sumNum = NumA + NumB + 1;
                carry = false;
            } else {
                sumNum = NumA + NumB;
            }

            if (sumNum >= 10) {
                carry = true;
                stack.push(sumNum - 10);
            } else {
                stack.push(sumNum);
            }
        }

        if (carry) {
            stack.push(1);
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
	} */
	
}
