package level0_1.exam40_49;

/*
 * 문제 이름 : 문자열 바꿔서 찾기
 * 문제 설명 : 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 * 입출력 예 : "ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다. 여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.
 * 입출력 예 : "ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다. 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181864
 * 
 * */
public class exam47 {

	// 내 풀이
	public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for(char myChar : myString.toCharArray()) {
            if(myChar == 'A') {
                sb.append('B');
            }else if(myChar == 'B') {
                sb.append('A');
            }
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
	
	// 남의 풀이
	/* public int solution(String myString, String pat) {
        return myString.contains(Stream.of(pat.split("")).map(str -> "A".equals(str)?"B":"A").collect(Collectors.joining()))?1:0;
    } */
	
	// 남의 풀이
	/* public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    } */

}
