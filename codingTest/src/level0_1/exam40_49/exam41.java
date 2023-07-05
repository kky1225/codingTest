package level0_1.exam40_49;

/*
 * 문제 이름 : 원하는 문자열 찾기
 * 문제 설명 : 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요. 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
 * 입출력 예 : "AbCdEfG"의 0~2번 인덱스의 문자열은 "AbC"이며, 이는 pat인 "aBc"와 같습니다. 따라서 1을 return 합니다.
 * 입출력 예 : myString의 길이가 pat보다 더 짧기 때문에 myString의 부분 문자열 중 pat와 같은 문자열이 있을 수 없습니다. 따라서 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181878
 * 
 * */
public class exam41 {

	// 내 풀이
	public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
	
	// 남의 풀이
	/* public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str.indexOf(str2) != -1) {
            return 1;
        }
        return 0;
    } */

}
