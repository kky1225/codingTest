package level0.exam90_99;

/*
 * 문제 이름 : 연속된 수의 합
 * 문제 설명 : 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 * 입출력 예 : num = 3, total = 12인 경우 [3, 4, 5]를 return합니다.
 * 입출력 예 : num = 5, total = 15인 경우 [1, 2, 3, 4, 5]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 * 
 * */
public class exam96 {

	// 내 풀이
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		int sum = 0;
		int start = -50;
		int i = 0;
		
		while(true) {
			i = start;
			sum = 0;
			
			for(int j=1; j<=num; j++) {
				sum += i;
                i++;
			}
			
			if(sum == total) break;
			else start += 1;
		}
		
		for(int j=0; j<answer.length; j++) {
			answer[j] = start;
			start++;
		}
        
        return answer;
    }
	
    // 남의 풀이
	/* public int[] solution(int num, int total) {
		int[] answer = new int[num];
        int check = num*(num+1) / 2;
        int start = (total - check) / num + 1;
        for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i ;
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int[] solution(int num, int total) {
		int[] answer = new int[num];
        int temp = 0;
        for(int i=0;i<num;i++){
            temp+=i;
        }
        int value = (total-temp)/num;

        for(int i=0;i<num;i++){
            answer[i]=i+value;
        }

        return answer;
	} */
	
}
