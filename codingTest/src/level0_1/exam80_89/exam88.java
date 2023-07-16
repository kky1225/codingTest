package level0_1.exam80_89;

/*
 * 문제 이름 : 이차원 배열 대각선 순회하기
 * 문제 설명 : 2차원 정수 배열 board와 정수 k가 주어집니다. i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181829
 * 
 * */
public class exam88 {

	// 내 풀이
	public int solution(int[][] board, int k) {
        int answer = 0;
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[][] board, int k) {
	    int answer = 0;
        for(int i = 0;board.length>i&&i<=k;i++){
            for(int j = 0;board[i].length>j&&j+i<=k;j++)answer+=board[i][j];
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[][] board, int k) {
	    return IntStream.range(0, board.length).filter(i -> i <= k).map(i -> IntStream.range(0, board[i].length).filter(j -> j <= k - i).map(j -> board[i][j]).sum()).sum();
	} */
	
}
