package level0.exam10_19;

/*
 * 문제 이름 : 배열 두배 만들기
 * 문제 설명 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
 * 입출력 예 : [1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120809
 * 
 * */
public class exam16 {

	// 내 풀이
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
	        
		for(int i=0; i<numbers.length; i++)
            answer[i] = numbers[i] * 2;
	        
	    return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    } */
	
}
