package level0_1.exam20_29;

/*
 * 문제 이름 : 카운트 다운
 * 문제 설명 : 정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181899
 * 
 * */
public class exam26 {

	// 내 풀이
	public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int index = 0;
        
        for(int i=start;i>=end;i--) {
            answer[index++] = i;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int start, int end) {
	    return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
	} */

}
