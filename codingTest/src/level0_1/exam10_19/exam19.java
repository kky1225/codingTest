package level0_1.exam10_19;

/*
 * 문제 이름 : 문자열 곱하기
 * 문제 설명 : 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 my_string은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.
 * 입출력 예 : 예제 2번의 my_string은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181940
 * 
 * */
public class exam19 {

	// 내 풀이
	public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int k) {
	    StringBuilder sb = new StringBuilder();
        for (int i=0; i<k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
	} */

}
