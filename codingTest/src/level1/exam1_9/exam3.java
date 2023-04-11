package level1.exam1_9;

/*
 * 문제 이름 : 약수의 합
 * 문제 설명 : 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * 입출력 예 : 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
 * 입출력 예 : 5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12928
 * 
 * */
public class exam3 {

	// 내 풀이
	public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++)
            if(n % i == 0)
                answer += i;
        
        return answer;
    }
	
    // 남의 풀이
	/* public int solution(int n) {
		int answer = 0;
    	for(int i =1 ; i<=num/2;i++){
      		if(num%i==0){
        		answer+=i;}}

        return answer+num;
    } */
	
}
