package level0_1.exam1_9;

/*
 * 문제 이름 : 공배수
 * 문제 설명 : 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.
 * 입출력 예 : 55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181936
 * 
 * */
public class exam4 {

	// 내 풀이
	public int solution(int number, int n, int m) {
        if(number % n == 0 && number % m == 0) {
            return 1;
        }
        
        return 0;
    }
	
	// 남의 풀이
	/* public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    } */

}
