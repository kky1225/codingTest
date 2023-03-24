package level0.exam80_89;

/*
 * 문제 이름 : 종이 자르기
 * 문제 설명 : 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다. 정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 이미 1 * 1 크기이므로 0을 return 합니다.
 * 입출력 예 : 가로 2 세로 5인 종이는 가로로 1번 세로로 8번 총 가위질 9번이 필요합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120922
 * 
 * */
public class exam82 {

	// 내 풀이
	public int solution(int M, int N) {
		int answer = 0;
		
		answer += M - 1;
		answer += (N - 1) * M;
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int M, int N) {
	    int answer = 0;
        answer = M*N-1;
        return answer;
	} */
	
}
