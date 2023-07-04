package level0_1.exam40_49;

/*
 * 문제 이름 : 특정한 문자를 대문자로 바꾸기
 * 문제 설명 : 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 my_string은 "programmers"이고 alp가 "p"이므로 my_string에 모든 p를 대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.
 * 입출력 예 : 예제 2번의 alp는 "x"이고 my_string에 x는 없습니다. 따라서 "lowercase"를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181873
 * 
 * */
public class exam40 {

	// 내 풀이
	public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
	
	// 남의 풀이
	/* public String solution(String my_string, String alp) {
        String a = alp.toUpperCase();
        return my_string.replaceAll( alp, a);
    } */

}
