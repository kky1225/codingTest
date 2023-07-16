package level0_1.exam80_89;

/*
 * 문제 이름 : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * 문제 설명 : 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181872
 * 
 * */
public class exam87 {

	// 내 풀이
	public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat)) + pat;
    }
	
	// 남의 풀이
	/* public String solution(String myString, String pat) {
	    String answer = "";

        for (int i = myString.length(); i >= 0; i--) {
            myString = myString.substring(0, i);
            if(myString.endsWith(pat)) {
                return myString;
            } 
        }
        return answer;
	} */
	
}
