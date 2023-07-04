package level0_1.exam30_39;

/*
 * 문제 이름 : 문자 리스트를 문자열로 변환하기
 * 문제 설명 : 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
			arr		result
 * 입출력 예 : ["a","b","c"]	"abc"
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181941
 * 
 * */
public class exam37 {

	// 내 풀이
	public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        
        for(String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String[] arr) {
	    StringBuffer sb = new StringBuffer();
        for (String a : arr)
            sb.append(a);
        return sb.toString();
	} */
	
	// 남의 풀이
	/* public String solution(String[] arr) {
        return String.join("", arr);
    } */

}
