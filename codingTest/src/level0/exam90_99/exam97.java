package level0.exam90_99;

/*
 * 문제 이름 : 안전지대
 * 문제 설명 : 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다. 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : (3, 2)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선 총 8칸은 위험지역입니다. 따라서 16을 return합니다.
 * 입출력 예 : (3, 2), (3, 3)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선은 위험지역입니다. 따라서 위험지역을 제외한 칸 수 13을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120866
 * 
 * */
public class exam97 {

	// 내 풀이
	public int solution(int[][] param) {
		int safeZone = 0;
        
		// 위험지역 Set
        for (int i = 0; i < param.length; i++) 
            for (int j = 0; j < param.length; j++) 
                if (param[i][j] == 1)
                    setArea(param, i, j);
        
        // 안전지역 Count
        for (int i = 0; i < param.length; i++) 
            for (int j = 0; j < param.length; j++) 
                if (param[i][j] == 0)
                    safeZone++;

        return safeZone;
	}
        
    void setArea(int[][] param, int x, int y) {
        for (int i = -1; i < 2; i++) 
            for (int j = -1; j < 2; j++) 
            	if (param[x + i][y + j] == 0)
            		param[x + i][y + j] = 2;
    }
	
    // 남의 풀이
	/* public int solution(int[][] board) {
		int answer = 0;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) { continue; }
                if (j-1 >= 0 && board[i][j-1] == 1) { continue; }
                if (i+1 <= board.length-1 && j-1 >= 0 && board[i+1][j-1] == 1) { continue; }
                if (i-1 >= 0 && board[i-1][j] == 1) { continue; }
                if (board[i][j] == 1) { continue; }
                if (i+1 <= board.length-1 && board[i+1][j] == 1) { continue; }
                if (i-1 >= 0 && j+1 <= board.length-1 && board[i-1][j+1] == 1) { continue; }
                if (j+1 <= board.length-1 && board[i][j+1] == 1) { continue; }
                if (i+1 <= board.length-1 && j+1 <= board.length-1 && board[i+1][j+1] == 1) { continue; }
                answer++;
            }
        }
        return answer;
    } */
	
}
