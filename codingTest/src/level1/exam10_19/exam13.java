package level1.exam10_19;

/*
 * 문제 이름 : 두 정수 사이의 합
 * 문제 설명 : 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 * 입출력 예 : 3, 5 : 12
 * 입출력 예 : 3, 3 : 3
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12912
 * 
 * */
public class exam13 {

	// 내 풀이
	public long solution(int a, int b) {
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        for(int i=start; i<=end; i++)
        	answer += i;
        
        return answer;
    }
	
	// 남의 풀이
	/* public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    } */
	
	// 남의 풀이
	/* public long solution(int a, int b) {
		long answer = 0;
      	for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      	return answer;
	} */
	
}
