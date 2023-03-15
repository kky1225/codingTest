package level0.exam50_59;

/*
 * 문제 이름 : 약수 구하기
 * 문제 설명 : 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 24의 약수를 오름차순으로 담은 배열 [1, 2, 3, 4, 6, 8, 12, 24]를 return합니다.
 * 입출력 예 : 29의 약수를 오름차순으로 담은 배열 [1, 29]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120897
 * 
 * */
public class exam56 {

	// 내 풀이
	public int[] solution(int n) {
		int[] answer = {};
		int cnt = 0;
		
		for(int i=1; i<=n; i++)
			if(n % i == 0)
				cnt++;
		
		answer = new int[cnt];
		cnt = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
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
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int n) {
	    return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
	} */
	
}
