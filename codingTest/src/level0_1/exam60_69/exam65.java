package level0_1.exam60_69;

import java.util.Arrays;

/*
 * 문제 이름 : 접미사 배열
 * 문제 설명 : 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다. 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181909
 * 
 * */
public class exam65 {

	// 내 풀이
	public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i=0;i<my_string.length();i++) {
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	// 남의 풀이
	/* public String[] solution(String my_string) {
	    return IntStream.range(0, myString.length()).mapToObj(myString::substring).sorted().toArray(String[]::new);
	} */
	
}
