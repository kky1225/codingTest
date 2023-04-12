package level1.exam1_9;

/*
 * 문제 이름 : 문자열 내 p와 y의 개수
 * 문제 설명 : 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 입출력 예 : 'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.
 * 입출력 예 : 'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 
 * */
public class exam5 {

	// 내 풀이
	boolean solution(String s) {
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;
		
		for(char c : s.toCharArray()) {
			if(String.valueOf(c).toLowerCase().equals("p"))
				pCount++;
			
			if(String.valueOf(c).toLowerCase().equals("y"))
				yCount++;
		}
		
		if(pCount != yCount && (pCount > 0 || yCount > 0)) {
			answer = false;
		}

        return answer;
    }
	
    // 남의 풀이
	/* boolean solution(String s) {
		s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    } */
	
	// 남의 풀이
	/* boolean solution(String s) {
		s = s.toUpperCase();

	    return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	} */
	
}
