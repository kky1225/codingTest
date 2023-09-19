package level2.exam10_19;

/*
 * 문제 이름 : 멀리 뛰기
 * 문제 설명 : 효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
			(1칸, 1칸, 1칸, 1칸)
			(1칸, 2칸, 1칸)
			(1칸, 1칸, 2칸)
			(2칸, 1칸, 1칸)
			(2칸, 2칸)
			의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 예를 들어 4가 입력된다면, 5를 return하면 됩니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12914
 * */
public class exam16 {

	// 내 풀이
	public long solution(int n) {
        if(n < 3) {
            return n;
        }
        
        long answer = 2;
        long a = 1;
        long b = 2;
        
        for(int i=3;i<=n;i++) {
            answer = (a + b)  % 1234567;
            a = b;
            b = answer;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public long solution(int n) {
        long answer = 0, a = 0, b = 1, cnt = 0;
        while(cnt != n) {
            answer = (a + b) % 1234567;
            a = b;
            b = answer;
            cnt++;
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public long solution(int n) {
        long[] dp = new long[2001];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])  % 1234567;
        }

        return dp[n];
    }

    private int lcm(int a, int b) {
        return a*b / BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    } */

}
