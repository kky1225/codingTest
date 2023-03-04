package level0.exam10_19;

/*
 * 문제 이름 : 배열의 평균값
 * 문제 설명 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : numbers의 원소들의 평균 값은 5.5입니다.
 * 입출력 예 : numbers의 원소들의 평균 값은 94.0입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120817
 * 
 * */
public class exam12 {

	// 내 풀이
	public double solution(int[] numbers) {
		double answer = 0;
        
		for(int i : numbers)
            answer += i;
        
        answer /= numbers.length;
        
        return answer;
    }
	
	// 남의 풀이
	/* public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    } */
	
}
