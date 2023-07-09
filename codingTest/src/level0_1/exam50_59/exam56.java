package level0_1.exam50_59;

/*
 * 문제 이름 : 홀수 vs 짝수
 * 문제 설명 : 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
 * 입출력 예 : 홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return합니다.
 * 입출력 예 : 홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181887
 * 
 * */
public class exam56 {

	// 내 풀이
	public int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i=0;i<num_list.length;i++) {
            if((i + 1) % 2 == 0) {
                evenSum += num_list[i];
            }else {
                oddSum += num_list[i];
            }
        }
        
        return Math.max(evenSum, oddSum);
    }
	
	// 남의 풀이
	/* public int solution(int[] num_list) {
	    return Integer.max(IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum(), IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
                .map(i -> num_list[i])
                .sum());
	} */
	
}
