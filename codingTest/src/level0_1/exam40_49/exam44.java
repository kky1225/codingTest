package level0_1.exam40_49;

/*
 * 문제 이름 : 접미사인지 확인하기
 * 문제 설명 : 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다. 문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번에서 is_suffix가 my_string의 접미사이기 때문에 1을 return 합니다.
 * 입출력 예 : 예제 2번에서 is_suffix가 my_string의 접미사가 아니기 때문에 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181908
 * 
 * */
public class exam44 {

	// 내 풀이
	public int solution(String my_string, String is_suffix) {
        int index = is_suffix.length();
        
        if(index > my_string.length()) {
            return 0;
        }
        
        my_string = my_string.substring(my_string.length() - index);
        
        return my_string.equals(is_suffix) ? 1 : 0;
    }
	
	// 남의 풀이
	/* public int solution(String my_string, String is_suffix) {
        if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    } */
	
	// 남의 풀이
	/* public int solution(String my_string, String is_suffix) {
	    if (!my_string.contains(is_suffix)) return 0;
        return my_string.lastIndexOf(is_suffix) == (my_string.length() - is_suffix.length()) ? 1 : 0;
	} */

}
