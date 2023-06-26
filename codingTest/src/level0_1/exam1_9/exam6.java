package level0_1.exam1_9;

/*
 * 문제 이름 : 문자열의 뒤의 n글자
 * 문제 설명 : 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 my_string에서 뒤의 11글자는 "grammerS123"이므로 이 문자열을 return 합니다.
 * 입출력 예 : 예제 2번의 my_string에서 뒤의 5글자는 "W0r1d"이므로 이 문자열을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181910
 * 
 * */
public class exam6 {

	// 내 풀이
	public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

}
