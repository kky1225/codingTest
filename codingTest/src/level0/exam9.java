package level0;

/*
 * 문제 이름 : 두 수의 나눗셈
 * 문제 설명 : 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 * 입출력 예 : num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
 * 입출력 예 : num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면 2333.3333.... 이 되며, 정수 부분은 2333입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120806
 * 
 * */
public class exam9 {

	// 내 풀이
	public int solution(int num1, int num2) {
        int answer = 0;
        
        answer = (int)(((float) num1 / num2) * 1000);
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int num1, int num2) {
        int answer = 0;
        
        return num1 * 1000 / num2;
    } */
	
}
