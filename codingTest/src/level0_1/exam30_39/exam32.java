package level0_1.exam30_39;

/*
 * 문제 이름 : 카운트 업
 * 문제 설명 : 정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181920
 * 
 * */
public class exam32 {

	// 내 풀이
	public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int index = 0;
        
        for(int i=start;i<=end;i++) {
            answer[index++] = i;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    } */

}
