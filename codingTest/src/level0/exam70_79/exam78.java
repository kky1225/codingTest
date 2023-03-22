package level0.exam70_79;

import java.math.BigInteger;

/*
 * 문제 이름 : 구슬을 나누는 경우의 수
 * 문제 설명 : 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요. 서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다. n! / ((n-m)! * m!)
 * 입출력 예 : 서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다.
 * 입출력 예 : 서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120840
 * 
 * */
public class exam78 {

	// 내 풀이
	public BigInteger solution(int balls, int share) {
		BigInteger answer = new BigInteger("0");
		
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		
		for(int i=2; i<=balls; i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
		
		for(int i=2; i<=balls-share; i++) {
			b = b.multiply(BigInteger.valueOf(i));
		}
		
		for(int i=2; i<=share; i++) {
			c = c.multiply(BigInteger.valueOf(i));
		}
		
		answer = a.divide(b.multiply(c));
		
		return answer;
	}
	
	// 남의 풀이
	/* public BigInteger solution(int balls, int share) {
	    String[] strs = my_string.split(" ");

        Stack<Integer> stack = new Stack<>();

        String operator = "";
        for (String str : strs) {
            if (str.equals("+") || str.equals("-")) operator = str;
            else if(isNumeric(str)) stack.push(Integer.parseInt(str));

            if (stack.size() == 2) {
                int a = stack.pop();
                int b = stack.pop();

                if (operator.equals("+")) stack.push(b + a);
                else stack.push(b - a);
            }
        }

        return stack.pop();
	} */
	
	// 남의 풀이
	/* public long solution(int balls, int share) {
	    share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
	} */
}
