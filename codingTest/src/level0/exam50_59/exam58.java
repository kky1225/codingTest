package level0.exam50_59;

import java.util.Arrays;

/*
 * 문제 이름 : 문자열 정렬하기 (2)
 * 문제 설명 : 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : "Bcad"를 모두 소문자로 바꾸면 "bcad"이고 이를 알파벳 순으로 정렬하면 "abcd"입니다.
 * 입출력 예 : "heLLo"를 모두 소문자로 바꾸면 "hello"이고 이를 알파벳 순으로 정렬하면 "ehllo"입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120911
 * 
 * */
public class exam58 {

	// 내 풀이
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
		String[] strAnswer = new String[my_string.length()];
		
		my_string = my_string.toLowerCase();
		
		for(int i=0; i<strAnswer.length; i++) {
			strAnswer[i] = String.valueOf(my_string.charAt(i));
		}
		
		Arrays.sort(strAnswer);
		
		for(String s : strAnswer)
			answer.append(s);
		
        return answer.toString();
	}
	
	// 남의 풀이
	/* public String solution(String my_string) {
	    char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
	} */
	
	// 남의 풀이
	/* public String solution(String my_string) {
	    return my_string.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	} */
	
	// 남의 풀이
	/* public String solution(String my_string) {
	    return Arrays.stream(myString.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
	} */
	
}
