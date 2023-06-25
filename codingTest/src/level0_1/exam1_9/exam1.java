package level0_1.exam1_9;

/*
 * 문제 이름 : 조건에 맞게 수열 변환하기 3
 * 문제 설명 : 정수 배열 arr와 자연수 k가 주어집니다. 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다. 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * 입출력 예 : 주어진 k인 3은 홀수이므로, 전체 배열에 3을 곱합니다. 따라서 [3, 6, 9, 300, 297, 294]을 return 합니다.
 * 입출력 예 : 주어진 k인 2는 짝수이므로, 전체 배열에 2를 더합니다. 따라서 [3, 4, 5, 102, 101, 100]을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181835
 * 
 * */
public class exam1 {

	// 내 풀이
	public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        boolean bool = false;
        
        if(k % 2 == 0) {
            bool = true;
        }
        
        for(int i=0;i<arr.length;i++) {
            if(bool) {
                answer[i] = arr[i] + k;
            }else {
                answer[i] = arr[i] * k;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(operand -> k % 2 == 0 ? operand + k : operand * k).toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int k) {
	    if(k%2==0) {
            return IntStream.of(arr).map(i->i+k).toArray();
        }

        return IntStream.of(arr).map(i->i*k).toArray();
	} */

}
