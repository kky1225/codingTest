package level1.exam1_9;

/*
 * 문제 이름 : x만큼 간격이 있는 n개의 숫자
 * 문제 설명 : 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 입출력 예 : 2, 5 [2,4,6,8,10]
 * 입출력 예 : 4, 3 [4,8,12]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12954
 * 
 * */
public class exam6 {

	// 내 풀이
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long sum = x;
		
		for(int i=0; i<n; i++) {
			answer[i] = sum;
			sum += x;
		}
		
        return answer;
    }
	
    // 남의 풀이
	/* public long[] solution(int x, int n) {
		long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public long[] solution(int x, int n) {
		return LongStream.iterate(x, i->i+x).limit(n).toArray();
	} */
	
}
