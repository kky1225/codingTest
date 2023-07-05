package level0_1.exam40_49;

/*
 * 문제 이름 : n 번째 원소부터
 * 문제 설명 : 정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [2, 1, 6]의 세 번째 원소부터 마지막 원소까지의 모든 원소는 [6]입니다.
 * 입출력 예 : [5, 2, 1, 7, 5]의 두 번째 원소부터 마지막 원소까지의 모든 원소는 [2, 1, 7, 5]입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181892
 * 
 * */
public class exam43 {

	// 내 풀이
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int index = 0;
        
        for(int i=n-1;i<num_list.length;i++) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    } */

}
