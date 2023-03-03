package level0;

/*
 * 문제 이름 : 짝수의 합
 * 문제 설명 : 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 * 입출력 예 : n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
 * 입출력 예 : n이 4이므로 2 + 4 = 6을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120831
 * 
 * */
public class exam10 {

	// 내 풀이
	public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i <= n; i++){
            if(i % 2 == 0)
                answer += i;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int num1, int num2) {
        return return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 0).sum();
    } */
	
}
