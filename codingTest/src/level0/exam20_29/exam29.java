package level0.exam20_29;

/*
 * 문제 이름 : 특정 문자 제거하기
 * 문제 설명 : 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "abcdef" 에서 "f"를 제거한 "abcde"를 return합니다.
 * 입출력 예 : "BCBdbe" 에서 "B"를 모두 제거한 "Cdbe"를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120826
 * 
 * */
public class exam29 {

	// 내 풀이
	public StringBuilder solution(String my_string, String letter) {
		StringBuilder answer = new StringBuilder();
		
		for(char c : my_string.toCharArray())
            if(c != letter.charAt(0))
            	answer.append(c);
		
        return answer;
    }
	
	// 남의 풀이
	/* public String solution(String my_string, String letter) {
		String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
	} */
	
}
