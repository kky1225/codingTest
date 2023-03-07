package level0.exam20_29;

/*
 * 문제 이름 : 최댓값 만들기 (1)
 * 문제 설명 : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 두 수의 곱중 최댓값은 4 * 5 = 20 입니다.
 * 입출력 예 : 두 수의 곱중 최댓값은 31 * 24 = 744 입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120847
 * 
 * */
public class exam23 {

	// 내 풀이
	public int solution(int[] numbers) {
		int answer = 0;
		int max = 0;
        int max2 = 0;
        
        for(int i : numbers){
            if(i > max){
                max2 = max;
                max = i;
            }else if(i > max2){
                max2 = i;
            }
        }
        
        answer = max * max2;

        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] numbers) {
	    int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
	} */
	
	// 남의 풀이
	/* public int solution(int[] numbers) {
	    // reverse sort
        numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int answer = numbers[0] * numbers[1];
        return answer;
	} */
	
}
