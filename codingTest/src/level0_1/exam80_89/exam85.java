package level0_1.exam80_89;

/*
 * 문제 이름 : 세로 읽기
 * 문제 설명 : 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181904
 * 
 * */
public class exam85 {

	// 내 풀이
	public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=c-1;i<my_string.length();i+=m) {
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int m, int c) {
	    return IntStream.range(0, myString.length())
            .filter(i -> i % m == c - 1)
            .mapToObj(i -> String.valueOf(myString.charAt(i)))
            .collect(Collectors.joining());
	} */
	
}
