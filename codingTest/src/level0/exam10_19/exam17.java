package level0.exam10_19;

/*
 * 문제 이름 : 문자열 뒤집기
 * 문제 설명 : 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
 * 입출력 예 : my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120822
 * 
 * */
public class exam17 {

	// 내 풀이
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
	        
		for(int i=0; i<my_string.length(); i++) {
			answer.append(my_string.charAt(my_string.length() - i - 1));
		}
	        
	    return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    } */
	
}
