package level0.exam30_39;

/*
 * 문제 이름 : 짝수는 싫어요
 * 문제 설명 : 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
 * 입출력 예 : 15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120813
 * 
 * */
public class exam31 {

	// 내 풀이
	public int[] solution(int n) {
		
		int[] answer = {};
        
        if(n % 2 == 0)
            answer = new int[n / 2];
        else
            answer = new int[n / 2 + 1];
        
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                answer[cnt] = i;
                cnt++;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int n) {
		List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int n) {
		return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
	} */
	
}
