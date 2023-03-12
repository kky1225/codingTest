package level0.exam40_49;

/*
 * 문제 이름 : n의 배수 고르기
 * 문제 설명 : 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다.
 * 입출력 예 : numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120845
 * 
 * */
public class exam47 {

	// 내 풀이
	public int[] solution(int n, int[] numlist) {
		int[] answer = {};
		int cnt = 0;
		
		for(int i : numlist) 
			if(i % n == 0)
				cnt++;
		
		answer = new int[cnt];
		cnt = 0;
		
		for(int i : numlist) {
			if(i % n == 0) {
				answer[cnt] = i;
				cnt++;
			}
		}
		
        return answer;
    }
	
	// 남의 풀이
	/* public ArrayList solution(int n, int[] numlist) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public int[] solution(int n, int[] numlist) {
		return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
	} */
	
}
