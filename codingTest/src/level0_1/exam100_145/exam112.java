package level0_1.exam100_145;

/*
 * 문제 이름 : 정사각형으로 만들기
 * 문제 설명 : 이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181830
 * 
 * */
public class exam112 {

	// 내 풀이
	public int[][] solution(int[][] arr) {
        int col = arr.length;
        int row = arr[0].length;
        
        int max = Math.max(col, row);
        
        int[][] answer = new int[max][max];
        
        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[][] solution(int[][] arr) {
	    int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }
        return array;
	} */
	
}
