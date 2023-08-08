package level0_1.exam100_125;

/*
 * 문제 이름 : 문자열 겹쳐쓰기
 * 문제 설명 : 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181943
 * 
 * */
public class exam114 {

	// 내 풀이
	public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length(), my_string.length());
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int[][] queries) {
	    String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
	} */
	
}
