package level0.exam40_49;

/*
 * 문제 이름 : 최댓값 만들기 (2)
 * 문제 설명 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
 * 입출력 예 : 두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120862
 * 
 * */
public class exam49 {

	// 내 풀이
	public int solution(int[] numbers) {
		int answer = Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length; i++)
            for(int j=i; j<numbers.length; j++)
                if(i != j && numbers[i] * numbers[j] > answer)
                    answer = numbers[i] * numbers[j];
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    } */
	
}
