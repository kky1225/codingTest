package level1.exam1_9;

/*
 * 문제 이름 : 평균 구하기
 * 문제 설명 : 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 입출력 예 : [1, 2, 3, 4]의 평균은 2.5입니다. 따라서 2.5를 return합니다.
 * 입출력 예 : [5, 5]의 평균은 5입니다. 따라서 5를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12944
 * 
 * */
public class exam1 {

	// 내 풀이
	public double solution(int[] arr) {
		double answer = 0;
		
		for(int i : arr) 
			answer += i;
		
        return answer / arr.length;
    }
	
    // 남의 풀이
	/* public double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
    } */
	
}
