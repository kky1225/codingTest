package level0_1.exam90_99;

/*
 * 문제 이름 : 문자열 뒤집기
 * 문제 설명 : 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181905
 * 
 * */
public class exam93 {

	// 내 풀이
	public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s;i++) {
            sb.append(my_string.charAt(i));
        }
        
        for(int i=e;i>=s;i--) {
            sb.append(my_string.charAt(i));
        }
        
        for(int i=e+1;i<my_string.length();i++) {
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    } */
	
	// 남의 풀이
	/* public String solution(String my_string, int s, int e) {
	    char[] arr = my_string.toCharArray();
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }

        return new String(arr);
	} */
	
}
