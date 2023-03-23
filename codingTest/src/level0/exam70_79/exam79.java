package level0.exam70_79;

/*
 * 문제 이름 : 삼각형의 완성조건 (2)
 * 문제 설명 : 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다. 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다. 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 두 변이 1, 2 인 경우 삼각형을 완성시키려면 나머지 한 변이 2여야 합니다. 따라서 1을 return합니다.
 * 입출력 예 : 가장 긴 변이 6인 경우, 될 수 있는 나머지 한 변은 4, 5, 6 로 3개입니다. 나머지 한 변이 가장 긴 변인 경우, 될 수 있는 한 변은 7, 8 로 2개입니다. 따라서 3 + 2 = 5를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120868
 * 
 * */
public class exam79 {

	// 내 풀이
	public int solution(int[] sides) {
		int answer = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i : sides) {
			if(i > max) 
				max = i;
			
			if(min > i) 
				min = i;
		}
		
		for(int i=max-min+1; i<=max; i++) 
			answer++;
		
		for(int i=max+1; i<max+min; i++) 
			answer++;
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int[] sides) {
	    int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        answer += min * 2 - 1;

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] sides) {
	    return Math.max(sides[0], sides[1]) - (Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1])) + (sides[0] + sides[1]) - Math.max(sides[0], sides[1]) - 1;
	} */
}
