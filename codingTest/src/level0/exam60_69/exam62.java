package level0.exam60_69;

import java.util.Arrays;

/*
 * 문제 이름 : A로 B 만들기
 * 문제 설명 : 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : "olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
 * 입출력 예 : "allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120886
 * 
 * */
public class exam62 {

	// 내 풀이
	public int solution(String before, String after) {
		int answer = 0;
		int cnt = 0;
		char[] cBefore = new char[before.length()];
		char[] cAfter = new char[after.length()];
		
		for(int i=0; i<before.length(); i++)
			cBefore[i] = before.charAt(i);
		
		for(int i=0; i<after.length(); i++)
			cAfter[i] = after.charAt(i);
		
		Arrays.sort(cBefore);
		Arrays.sort(cAfter);
		
		for(int i=0; i<cBefore.length; i++) 
			if(cBefore[i] == cAfter[i])
				cnt++;
		
		if(cnt == cBefore.length)
			answer = 1;
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(String before, String after) {
	    char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
	} */
	
	// 남의 풀이
	/* public int solution(String before, String after) {
	    for(int i = 0; i < before.length(); i++){
            after = after.replaceFirst(before.substring(i,i+1),"");
        }
        return after.length() == 0? 1: 0;
	} */
	
}
