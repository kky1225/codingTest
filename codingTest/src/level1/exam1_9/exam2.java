package level1.exam1_9;

/*
 * 문제 이름 : 짝수와 홀수
 * 문제 설명 : 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * 입출력 예 : 3, Odd
 * 입출력 예 : 4, Even
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12937
 * 
 * */
public class exam2 {

	// 내 풀이
	public String solution(int num) {
		String answer = "";
        
        if(num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";
        
        return answer;
    }
	
    // 남의 풀이
	/* public String solution(int num)) {
		return (num % 2 == 0) ? "Even" : "Odd";
    } */
	
}
