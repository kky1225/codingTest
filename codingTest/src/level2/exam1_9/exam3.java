package level2.exam1_9;

/*
 * 문제 이름 : JadenCase 문자열 만들기
 * 문제 설명 : JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고) 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * 
 * */
public class exam3 {

	// 내 풀이
	public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean firstWord = true;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                firstWord = true;
            }
            
            if(firstWord) {
                if(s.charAt(i) == ' ') {
                    sb.append(' ');
                }else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    firstWord = false;
                }
            }else {
                if(s.charAt(i) == ' ') {
                    sb.append(' ');
                }else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public String solution(String s) {
	    String answer = "";

        String[] str = s.split(" ");

        for(String ss : str)
            if(ss.length() > 0)
                answer += ss.substring(0,1).toUpperCase() + ss.substring(1).toLowerCase() + " ";
            else
                answer += " ";
        if (s.charAt(s.length() - 1) != ' ')
            answer = answer.substring(0, answer.length()-1);
        return answer;
	} */

}
