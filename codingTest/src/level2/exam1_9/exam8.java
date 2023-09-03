package level2.exam1_9;

/*
 * 문제 이름 : 피보나치 수
 * 문제 설명 : 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다. 예를들어
			F(2) = F(0) + F(1) = 0 + 1 = 1
			F(3) = F(1) + F(2) = 1 + 1 = 2
			F(4) = F(2) + F(3) = 1 + 2 = 3
			F(5) = F(3) + F(4) = 2 + 3 = 5
			와 같이 이어집니다. 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12945
 * */
public class exam8 {

	// 내 풀이
	public int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        
        
        for(int i=2;i<=n;i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        
        return arr[n];
    }
	
	// 남의 풀이
	/* static BigInteger[] arr;

    public int solution(int n) {
        arr = new BigInteger[n+1];

        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;

        return fibonacci(n).remainder(BigInteger.valueOf(1234567)).intValue();
    }

    private BigInteger fibonacci(int n){
        if(arr[n] == null){
            arr[n] = fibonacci(n-1).add(fibonacci(n-2));
        }

        return arr[n];
    } */

}
