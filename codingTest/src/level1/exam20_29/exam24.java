package level1.exam20_29;

import java.util.Arrays;

/*
 * 문제 이름 : 문자열 내림차순으로 배치하기
 * 문제 설명 : 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요. s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * 입출력 예 : "Zbcdefg" : "gfedcbZ"
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12917
 * 
 * */
public class exam24 {

	// 내 풀이
	public String solution(String s) {
        char[] c = new char[s.length()];
        StringBuilder lowerSb = new StringBuilder();
        StringBuilder upperSb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
            c[i] = s.charAt(i);
        
        Arrays.sort(c);

        for(int i=c.length-1; i>=0; i--){
            if(Character.isLowerCase(c[i]))
                lowerSb.append(c[i]);
            else
                upperSb.append(c[i]);
        }

        return lowerSb.toString() + upperSb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String s) {
	    char[] sol = str.toCharArray();
    	Arrays.sort(sol);
    	return new StringBuilder(new String(sol)).reverse().toString();
	} */
	
	// 남의 풀이
	/* public String solution(String s) {
	    return Stream.of(str.split(""))
    	.sorted(Comparator.reverseOrder())
    	.collect(Collectors.joining());
	} */
	
}
