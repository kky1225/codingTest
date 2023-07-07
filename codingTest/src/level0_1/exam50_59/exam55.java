package level0_1.exam50_59;

/*
 * 문제 이름 : 부분 문자열 이어 붙여 문자열 만들기
 * 문제 설명 : 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다. parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 입력을 보기 좋게 표로 나타내면 다음과 같습니다. 각 부분 문자열을 순서대로 이어 붙인 문자열은 "programmers"입니다. 따라서 "programmers"를 return 합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181911
 * 
 * */
public class exam55 {

	// 내 풀이
	public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_strings.length;i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String[] my_strings, int[][] parts) {
	    return IntStream.range(0, myStrings.length).mapToObj(i -> myStrings[i].substring(parts[i][0], parts[i][1] + 1)).collect(Collectors.joining());
	} */
	
}
