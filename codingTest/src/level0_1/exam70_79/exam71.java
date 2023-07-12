package level0_1.exam70_79;

/*
 * 문제 이름 : 가까운 1 찾기
 * 문제 설명 : 정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요. 단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181898
 * 
 * */
public class exam71 {

	// 내 풀이
	public int solution(int[] arr, int idx) {
        int answer = -1;
        
        for(int i=0;i<arr.length;i++) {
            if(i >= idx && arr[i] == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] arr, int idx) {
	    return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
	} */
	
}
