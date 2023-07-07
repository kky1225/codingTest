package level0_1.exam50_59;

import java.util.Arrays;

/*
 * 문제 이름 : 뒤에서 5등까지
 * 문제 설명 : 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [12, 4, 15, 46, 38, 1, 14]를 정렬하면 [1, 4, 12, 14, 15, 38, 46]이 되고, 앞에서 부터 5개를 고르면 [1, 4, 12, 14, 15]가 됩니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181853
 * 
 * */
public class exam51 {

	// 내 풀이
	public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int[] answer = new int[5];
        
        for(int i=0;i<5;i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
            .sorted()
            .limit(5)
            .toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 0, 5);
    } */

}
