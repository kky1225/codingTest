package level0.exam80_89;

/*
 * 문제 이름 : 직사각형 넓이 구하기
 * 문제 설명 : 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 좌표 [[1, 1], [2, 1], [2, 2], [1, 2]] 를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 1, 1이므로 직사각형의 넓이는 1 x 1 = 1입니다.
 * 입출력 예 : 좌표 [[-1, -1], [1, 1], [1, -1], [-1, 1]]를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 각각 2, 2이므로 직사각형의 넓이는 2 x 2 = 4입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120860
 * 
 * */
public class exam83 {

	// 내 풀이
	public int solution(int[][] dots) {
		int answer = 0;
		int maxX = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		
		for(int i=0; i<dots.length; i++) {
			if(dots[i][0] > maxX) 
				maxX = dots[i][0];
			
			if(minX > dots[i][0]) 
				minX = dots[i][0];
			
			if(dots[i][1] > maxY) 
				maxY = dots[i][1];
			
			if(minY > dots[i][1]) 
				minY = dots[i][1];
		}
		
		answer = Math.abs(maxX - minX) * Math.abs(maxY - minY);
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int[][] dots) {
	    Arrays.sort(dots,Comparator.comparing((int[] it)-> it[0]).thenComparing((int[] it)->it[1]));
        return (dots[3][0] - dots[0][0]) * (dots[3][1] - dots[0][1]);
	} */
	
}
