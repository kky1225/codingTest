package level0.exam70_79;

/*
 * 문제 이름 : 이진수 더하기
 * 문제 설명 : 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10 + 11 = 101 이므로 "101" 을 return합니다.
 * 입출력 예 : 1001 + 1111 = 11000 이므로 "11000"을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120885
 * 
 * */
public class exam70 {

	// 내 풀이
	public String solution(String bin1, String bin2) {
		String answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
		
		return answer;
	}
	
	// 남의 풀이
	/* public String solution(String bin1, String bin2) {
	    return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	} */
	
}
