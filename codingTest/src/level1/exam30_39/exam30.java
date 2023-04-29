package level1.exam30_39;

/*
 * 문제 이름 : 최대공약수와 최소공배수
 * 문제 설명 : 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * 입출력 예 : 자연수 3와 12의 최대공약수는 3, 최소공배수는 12이므로 [3, 12]을 리턴해야 합니다.
 * 입출력 예 : 자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12940
 * 
 * */
public class exam30 {

	// 내 풀이
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        
        for(int i=1; i<1000000; i++) 
        	if(n % i == 0 && m % i == 0 && i > max) 
        		max = i;
            
        answer[0] = max;
        answer[1] = n * m / max;
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n,m);
        answer[1] = (n*m)/answer[0];
        
        return answer;
    }

	public static int gcd(int p, int q){
    	if (q == 0) return p;
    	return gcd(q, p%q);
   	} */
	
}
