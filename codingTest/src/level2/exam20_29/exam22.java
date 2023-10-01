package level2.exam20_29;

/*
 * 문제 이름 : 행렬의 곱셈
 * 문제 설명 : 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12949
 * */
public class exam22 {

	// 내 풀이
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr2[0].length;j++) {
                int sum = 0;
                
                for(int k=0;k<arr1[0].length;k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }

}
