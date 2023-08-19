package level0_1.exam100_125;

/*
 * 문제 이름 : 정수를 나선형으로 배치하기
 * 문제 설명 : 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181832
 * 
 * */
public class exam125 {

	// 내 풀이
	public int[][] solution(int n) {
        int x = 0;
        int y = 0;
        int count = 1;
        
        int[][] answer = new int[n][n];
        answer[x][y] = count;
        
        while(count < n * n) {
            while(y < n - 1) {
                if(answer[x][++y] != 0) {
                    y--;
                    break;
                }
                
                answer[x][y] = ++count;
            }
            
            while(x < n - 1) {
                if(answer[++x][y] != 0) {
                    x--;
                    break;
                }
                
                answer[x][y] = ++count;
            }
            
            while(y > 0) {
                if(answer[x][--y] != 0) {
                    y++;
                    break;
                }
                
                answer[x][y] = ++count;
            }
            
            while(x > 0) {
                if(answer[--x][y] != 0) {
                    x++;
                    break;
                }
                
                answer[x][y] = ++count;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[][] solution(int n) { 
	    int[][] array = new int[n][n];
        int num = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 왼쪽에서 오른쪽으로
            for (int i = colStart; i <= colEnd; i++) {
                array[rowStart][i] = num++;
            }
            rowStart++;

            // 위에서 아래로
            for (int i = rowStart; i <= rowEnd; i++) {
                array[i][colEnd] = num++;
            }
            colEnd--;

            // 오른쪽에서 왼쪽으로
            for (int i = colEnd; i >= colStart; i--) {
                array[rowEnd][i] = num++;
            }
            rowEnd--;

            // 아래에서 위로
            for (int i = rowEnd; i >= rowStart; i--) {
                array[i][colStart] = num++;
            }
            colStart++;
        }
        return array;
	} */
	
}
