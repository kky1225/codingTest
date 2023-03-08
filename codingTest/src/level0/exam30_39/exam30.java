package level0.exam30_39;

import java.util.Arrays;

/*
 * 문제 이름 : 중앙값 구하기
 * 문제 설명 : 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 본문과 동일합니다.
 * 입출력 예 : 9, -1, 0을 오름차순 정렬하면 -1, 0, 9이고 가장 중앙에 위치하는 값은 0입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120826
 * 
 * */
public class exam30 {

	// 내 풀이
	public int solution(int[] array) {
		int answer = 0;
		
		Arrays.sort(array);
        answer = array[array.length / 2];
		
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] array) {
		Arrays.sort(array);
        return array[array.length >> 1];
	} */
	
}
