package level0_1.exam80_89;

/*
 * 문제 이름 : 수열과 구간 쿼리 3
 * 문제 설명 : 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다. 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다. 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181924
 * 
 * */
public class exam86 {

	// 내 풀이
	public int[] solution(int[] arr, int[][] queries) {
        for(int i=0;i<queries.length;i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        
        return arr;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int[][] queries) {
	    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        return list;
	} */
	
}
