package level0_1.exam100_145;

/*
 * 문제 이름 : qr code
 * 문제 설명 : 두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181903
 * 
 * */
public class exam105 {

	// 내 풀이
	public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<code.length();i++) {
            if(i % q == r) {
                sb.append(code.charAt(i));
            }
        }
        
        return sb.toString();
    }
	
}
