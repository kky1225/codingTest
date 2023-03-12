package level0.exam40_49;

/*
 * 문제 이름 : 세균 증식
 * 문제 설명 : 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 처음엔 2마리, 1시간 후엔 4마리, 2시간 후엔 8마리, ..., 10시간 후엔 2048마리가 됩니다. 따라서 2048을 return합니다.
 * 입출력 예 : 처음엔 7마리, 1시간 후엔 14마리, 2시간 후엔 28마리, ..., 15시간 후엔 229376마리가 됩니다. 따라서 229,376을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120910
 * 
 * */
public class exam45 {

	// 내 풀이
	public int solution(int n, int t) {
		int answer = 0;
		
		for(int i=1; i<=t; i++)
            answer *= 2;
		
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n, int t) {
		int answer = n * (int)Math.pow(2,t);
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int n, int t) {
		int answer = 0;

        answer = n << t;

        return answer;
	} */
	
}
