package level0_1.exam30_39;

/*
 * 문제 이름 : n 번째 원소까지
 * 문제 설명 : 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.
 * 입출력 예 : [5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181889
 * 
 * */
public class exam38 {

	// 내 풀이
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        
        for(int i=0;i<n;i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    } */

}
