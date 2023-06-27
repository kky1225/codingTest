package level0_1.exam10_19;

/*
 * 문제 이름 : 부분 문자열인지 확인하기
 * 문제 설명 : 부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
			문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
			my_string	target	result
 * 입출력 예 : "banana"		"ana"	1
 * 입출력 예 : "banana"		"wxyz"	0
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181843
 * 
 * */
public class exam11 {

	// 내 풀이
	public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
	
	// 남의 풀이
	/* public int solution(String my_string, String target) {
	    return my_string.indexOf(target) > -1 ? 1 : 0;
	} */

}
