package level0.exam60_69;

/*
 * 문제 이름 : 팩토리얼
 * 문제 설명 : i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10! = 3,628,800입니다. n이 3628800이므로 최대 팩토리얼인 10을 return 합니다.
 * 입출력 예 : 3! = 6, 4! = 24입니다. n이 7이므로, 7 이하의 최대 팩토리얼인 3을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120848
 * 
 * */
public class exam63 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;
		int sum = 1;
		
		for(int i=1; i<=10; i++) {
			sum = 1;
			
			for(int j=i; j>=1; j--) {
				sum *= j;
			}
			
			if(sum > n) {
				answer = i - 1;
				break;
			}else if(sum == n) {
				answer = i;
				break;
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int n) {
	    int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            }else break;
        }

        return i-1;
	} */
	
	// 남의 풀이
	/* public int solution(int n) {
	    int answer = 0;
        int sum=1;

        for(int i=1; i<=10; i++) {    
            sum=sum*i;

            if(sum>n){
                answer = i-1;
                break;
            }
            if(sum==n){
                answer = i;
                break;
            }

        }    

        return answer;
	} */
	
}
