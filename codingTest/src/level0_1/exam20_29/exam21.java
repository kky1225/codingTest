package level0_1.exam20_29;

/*
 * 문제 이름 : 꼬리 문자열
 * 문제 설명 : 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다. 꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다. 예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
			문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.
			str_list		ex		result
 * 입출력 예 : ["abc", "def", "ghi"]	"ef"	"abcghi"
 * 입출력 예 : ["abc", "bbc", "cbc"]	"c"	""
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181841
 * 
 * */
public class exam21 {

	// 내 풀이
	public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for(String str : str_list) {
            if(!str.contains(ex)) {
                sb.append(str);
            }
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String[] str_list, String ex) {
	    return Arrays.stream(strList).filter(s -> !s.contains(ex)).collect(Collectors.joining());
	} */

}
