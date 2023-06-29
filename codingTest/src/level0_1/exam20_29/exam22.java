package level0_1.exam20_29;

/*
 * 문제 이름 : 접두사인지 확인하기
 * 문제 설명 : 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다. 문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번에서 is_prefix가 my_string의 접두사이기 때문에 1을 return 합니다.
 * 입출력 예 : 예제 2번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181906
 * 
 * */
public class exam22 {

	// 내 풀이
	public int solution(String my_string, String is_prefix) {
        int index = is_prefix.length();
        
        if(index > my_string.length()) {
            return 0;
        }
        
        my_string = my_string.substring(0, index);
        
        return my_string.equals(is_prefix) ? 1 : 0;
    }
	
	// 남의 풀이
	/* public int solution(String my_string, String is_prefix) {
	    if (my_string.startsWith(is_prefix)) return 1;
        return 0;
	} */

}
