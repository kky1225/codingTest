package level0.exam60_69;

/*
 * 문제 이름 : 2차원으로 만들기
 * 문제 설명 : 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요. num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다. 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
 * 입출력 예 : num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 2 * 4 배열로 변경한 [[1, 2], [3, 4], [5, 6], [7, 8]] 을 return합니다.
 * 입출력 예 : num_list가 [100, 95, 2, 4, 5, 6, 18, 33, 948] 로 길이가 9이고 n이 3이므로 3 * 3 배열로 변경한 [[100, 95, 2], [4, 5, 6], [18, 33, 948]] 을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120842
 * 
 * */
public class exam64 {

	// 내 풀이
	public int[][] solution(int[] num_list, int n) {
		int index = num_list.length / n;
		int cnt = 0;
		int[][] answer = new int[n][index];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<index; j++) {
				answer[i][j] = num_list[cnt];
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int[][] solution(int[] num_list, int n) {
	    int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public int[][] solution(int[] num_list, int n) {
	    int[][] answer = new int[num_list.length/n][n];

        int chk = 0;
        for(int i =0; i <= num_list.length-1; i+=n){
            int[] a = Arrays.copyOfRange(num_list, i, i+n);
            answer[chk] = a;
            chk++;
        }
        return answer;
	} */
	
}
