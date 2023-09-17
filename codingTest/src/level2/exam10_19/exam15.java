package level2.exam10_19;

/*
 * 문제 이름 : N개의 최소공배수
 * 문제 설명 : 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 
			정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12953
 * */
public class exam15 {

	// 내 풀이
	public int solution(int[] arr) {
        int num = 1;
        
        while(true) {
            boolean check = true;
            
            for(int i : arr) {
                if(num % i != 0) {
                    check = false;
                }
            }
            
            if(check) {
                return num;
            }
            
            num++;
        }
    }
	
	// 남의 풀이
	/*  public int solution(int[] arr) {
        int current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current = (current * arr[i]) / gcd(current, arr[i]);
        }
        return current;
    }

    public int gcd(int a, int b) {
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger gcd = num1.gcd(num2);

        return gcd.intValue();
    } */
	
	// 남의 풀이
	/*  public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    private int lcm(int a, int b) {
        return a*b / BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    } */

}
