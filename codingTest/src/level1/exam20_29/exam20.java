package level1.exam20_29;

/*
 * 문제 이름 : 없는 숫자 더하기
 * 문제 설명 : 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [1,2,3,4,6,7,8,0] : 14
 * 입출력 예 : [5,8,4,0,6,7,9] : 6
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/86051
 * 
 * */
public class exam20 {

	// 내 풀이
	public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=1; i<=9; i++) {
            int check = 0;
            
            for(int j : numbers)
                if(i == j)
                    check = 1;
            
            if(check == 0)
                answer += i;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] numbers) {
	    int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
	} */
	
	// 남의 풀이
	/* public int solution(int[] numbers) {
	    return 45-Arrays.stream(numbers).sum();
	} */
	
	// 남의 풀이
	/* public int solution(int[] numbers) {
	    return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
	} */
	
}
