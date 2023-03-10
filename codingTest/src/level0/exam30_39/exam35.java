package level0.exam30_39;

/*
 * 문제 이름 : 자릿수 더하기
 * 문제 설명 : 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 * 입출력 예 : 1 + 2 + 3 + 4 = 10을 return합니다.
 * 입출력 예 : 9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120906
 * 
 * */
public class exam35 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;
        
        if(n == 1000000)
            answer = 1;
        
        if(n >= 100000){
            answer += n / 100000;
            n %= 100000;
        }
        
        if(n >= 10000){
            answer += n / 10000;
            n %= 10000;
        }
        
        if(n >= 1000){
            answer += n / 1000;
            n %= 1000;
        }
        
        if(n >= 100){
            answer += n / 100;
             n %= 100;
        }
        
        if(n >= 10){
            answer += n / 10;
            n %= 10;
        }
        
        answer += n;
                
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
		int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int n) {
		return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
	} */
	
}
