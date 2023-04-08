package level0.exam90_99;

/*
 * 문제 이름 : 평행
 * 문제 설명 : 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다. [[x1, y1], [x2, y2], [x3, y3], [x4, y4]] 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 점 [1, 4], [3, 8]을 잇고 [9, 2], [11, 6]를 이으면 두 선분은 평행합니다.
 * 입출력 예 : 점을 어떻게 연결해도 평행하지 않습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120875
 * 
 * */
public class exam99 {

	// 내 풀이
	public int solution(int[][] dots) {
		int answer = 0;
        
		if((double)(dots[1][0] - dots[0][0]) / (double)(dots[1][1] - dots[0][1]) == (double)(dots[3][0] - dots[2][0]) / (double)(dots[3][1] - dots[2][1])) {
			answer = 1;
		}
		
		if((double)(dots[2][0] - dots[0][0]) / (double)(dots[2][1] - dots[0][1]) == (double)(dots[3][0] - dots[1][0]) / (double)(dots[3][1] - dots[1][1])) {
			answer = 1;
		}
		
		if((double)(dots[3][0] - dots[0][0]) / (double)(dots[3][1] - dots[0][1]) == (double)(dots[2][0] - dots[1][0]) / (double)(dots[2][1] - dots[1][1])) {
			answer = 1;
		}
        
        return answer;
    }
	
    // 남의 풀이
	/* public int solution(int[][] dots) {
		int answer = 0;

        // 1,2 번째 점
        int a = (dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0]);
        int b = (dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0]);
        if(a == b || (Math.abs(a) == 1 && Math.abs(b)==1)) return 1;

        //1,3 번째 점
        a = (dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0]);
        b = (dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0]);
        if(a == b || (Math.abs(a) == 1 && Math.abs(b)==1)) return 1;

        // 1,4 번째 점
        a = (dots[0][1] - dots[3][1]) * (dots[2][0] - dots[1][0]);
        b = (dots[2][1] - dots[1][1]) * (dots[0][0] - dots[3][0]);
        if(a == b || (Math.abs(a) == 1 && Math.abs(b)==1)) return 1;

        return answer;
    } */
	
}
