package level0_1.exam80_89;

/*
 * 문제 이름 : 수열과 구간 쿼리 1
 * 문제 설명 : 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.m 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다. 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181883
 * 
 * */
public class exam82 {

	// 내 풀이
	public int[] solution(int[] arr, int[][] queries) {
        for(int i=0;i<queries.length;i++) {
            for(int j=queries[i][0];j<=queries[i][1];j++) {
                arr[j] += 1;
            }
        }
        
        return arr;
    }
	
}
