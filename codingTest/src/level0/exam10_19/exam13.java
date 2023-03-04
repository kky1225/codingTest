package level0.exam10_19;

/*
 * 문제 이름 : 피자 나눠 먹기 (1)
 * 문제 설명 : 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 * 입출력 예 : 7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.
 * 입출력 예 : 1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120814
 * 
 * */
public class exam13 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;
        int remain = n % 7;
        
        answer = n / 7;
        
        if(answer == 0 && remain > 0)
            answer = 1;
        else if(answer > 0 && remain > 0)
            answer += 1;
            
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
        return (n + 6) / 7;
    } */
	
}
