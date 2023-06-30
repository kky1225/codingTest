package level0_1.exam20_29;

/*
 * 문제 이름 : 문자열 정수의 합
 * 문제 설명 : 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 문자열 안의 모든 숫자를 더하면 45가 됩니다.
 * 입출력 예 : 문자열 안의 모든 숫자를 더하면 1이 됩니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181849
 * 
 * */
public class exam29 {

	// 내 풀이
	public int solution(String num_str) {
        int answer = 0;
        
        for(char num_char : num_str.toCharArray()) {
            answer += num_char - '0';
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String num_str) {
        return numStr.chars().map(c -> c - 48).sum();
    } */

}
