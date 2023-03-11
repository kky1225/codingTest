package level0.exam40_49;

import java.util.Arrays;

/*
 * 문제 이름 : 문자열 정렬하기 (1)
 * 문제 설명 : 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 * 입출력 예 : "hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.
 * 입출력 예 : "p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120850
 * 
 * */
public class exam41 {

	// 내 풀이
	public int[] solution(String my_string) {
		int[] answer = {};
		int cnt = 0;
		
		for(char c : my_string.toCharArray()) {
			if(Character.isDigit(c)) {
				cnt++;
			}
		}
		
		answer = new int[cnt];
		cnt = 0;
		
		for(char c : my_string.toCharArray()) {
			if(Character.isDigit(c)) {
				answer[cnt] = Integer.parseInt(String.valueOf(c));
				cnt++;
			}
		}
		
		Arrays.sort(answer);
		
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String my_string) {
		List<String> list = new ArrayList<>();
	    for(int i = 0; i < my_string.length(); i++) {
	        char characterData = my_string.charAt(i);

	        if (Character.isDigit(characterData)) {
	            String stringData = String.valueOf(characterData);
	            list.add(stringData);
	        }
	    }
	    return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(String my_string) {
		return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
	} */
	
}
