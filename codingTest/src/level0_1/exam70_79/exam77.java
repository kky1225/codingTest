package level0_1.exam70_79;

/*
 * 문제 이름 : 문자열 섞기
 * 문제 설명 : 길이가 같은 두 문자열 str1과 str2가 주어집니다. 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181942
 * 
 * */
public class exam77 {

	// 내 풀이
	public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str1.length();i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String str1, String str2) {
	    String answer = "";

        int length = str1.length();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i=0; i<length; i++) {
            answer += str1arr[i]+str2arr[i];
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String str1, String str2) {
	    char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<chars1.length; i++) {
            sb.append(chars1[i]).append(chars2[i]);
        }

        return sb.toString();d
	} */
	
}
