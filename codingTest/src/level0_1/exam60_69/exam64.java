package level0_1.exam60_69;

/*
 * 문제 이름 : 특별한 이차원 배열 1
 * 문제 설명 : 정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요. arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181833
 * 
 * */
public class exam64 {

	// 내 풀이
	public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int index = 0;
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(index == j) {
                    answer[i][j] = 1;
                }
            }
            
            index++;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[][] solution(int n) {
	    int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
	} */
	
}
