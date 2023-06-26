package level0_1.exam10_19;

/*
 * 문제 이름 : n의 배수
 * 문제 설명 : 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 98은 2의 배수이므로 1을 return합니다.
 * 입출력 예 : 32는 3의 배수가 아니므로 0을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181937
 * 
 * */
public class exam10 {

	// 내 풀이
	public int solution(int num, int n) {
        if(num % n == 0) {
            return 1;
        }
        
        return 0;
    }
	
	// 남의 풀이
	/* public int solution(int num, int n) {
	    int answer = num % n == 0 ? 1 : 0;
        return answer;
	} */

}
