package level0.exam90_99;

/*
 * 문제 이름 : 다음에 올 숫자
 * 문제 설명 : 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : [1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
 * 입출력 예 : [2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120924
 * 
 * */
public class exam95 {

	// 내 풀이
	public int solution(int[] common) {
		int answer = 0;
		int a = common[1] - common[0];
		int b = 0;
		
		if(common[0] != 0) 
			b = common[1] / common[0];
		
		int check = 1; // 1이면 등비수열, 0이면 등차수열
		
		for(int i=0; i<common.length; i++) {
			if(common[i + 1] - common[i] != a) {
				check = 0;
			}
		}
		
		if(check == 1) answer = common[common.length - 1] + a;
		else answer = common[common.length - 1] * b;
		
        return answer;
    }
	
    // 남의 풀이
	/* public int solution(int[] common) {
		int answer = 0;

        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }

        return answer;
    } */
	
}
