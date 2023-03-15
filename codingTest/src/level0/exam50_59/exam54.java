package level0.exam50_59;

/*
 * 문제 이름 : 피자 나눠 먹기 (2)
 * 문제 설명 : 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 6명이 모두 같은 양을 먹기 위해 한 판을 시켜야 피자가 6조각으로 모두 한 조각씩 먹을 수 있습니다.
 * 입출력 예 : 10명이 모두 같은 양을 먹기 위해 최소 5판을 시켜야 피자가 30조각으로 모두 세 조각씩 먹을 수 있습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120815
 * 
 * */
public class exam54 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;
		
		for(int i=1; i<=Integer.MAX_VALUE; i++) {
			if(i % 6 == 0 && i % n == 0) {
				answer = i / 6;
				break;
			}
		}
		
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
	    int answer = 0;
        for(int i=1; i<=n; i++){
            if(i * 6 % n == 0){
                answer = i;
                break;
            }
        }
        return answer;
	} */
	
}
