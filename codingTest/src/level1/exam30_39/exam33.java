package level1.exam30_39;

/*
 * 문제 이름 : 이상한 문자 만들기
 * 문제 설명 : 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 입출력 예 : "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * 
 * */
public class exam33 {

	// 내 풀이
	public String solution(String s) {
		s = s.toLowerCase();
		
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        for(int i=0;i<s.length();i++) {
        	if(index % 2 == 0) 
        		sb.append(Character.toUpperCase(s.charAt(i)));
        	else 
        		sb.append(s.charAt(i));
        	
        	if(String.valueOf(s.charAt(i)).equals(" "))
        		index = 0;
        	else 
        		index += 1;
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
    } */
	
	// 남의 풀이
	/* public String solution(String s) {
	    char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
	} */
	
}
