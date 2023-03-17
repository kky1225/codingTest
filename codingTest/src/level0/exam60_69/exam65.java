package level0.exam60_69;

import java.util.Arrays;

/*
 * 문제 이름 : 가까운 수
 * 문제 설명 : 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 3, 10, 28 중 20과 가장 가까운 수는 28입니다.
 * 입출력 예 : 10, 11, 12 중 13과 가장 가까운 수는 12입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120890
 * 
 * */
public class exam65 {

	// 내 풀이
	public int solution(int[] array, int n) {
		int answer = 0;
		int temp = Integer.MAX_VALUE;
		int cha = 0;
		
		Arrays.sort(array);
		
		for(int i : array) {
			if(n >= i) 
				cha = n - i;
			else 
				cha = i - n;
			
			if(temp > cha) {
				answer = i;
				temp = cha;
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int[] array, int n) {
	    int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] array, int n) {
	    return Math.min(array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).indexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))], array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).lastIndexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))]);
	} */
	
}
