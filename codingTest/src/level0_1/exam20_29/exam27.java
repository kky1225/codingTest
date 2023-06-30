package level0_1.exam20_29;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : n개 간격의 원소들
 * 문제 설명 : 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
 * 입출력 예 : [4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181888
 * 
 * */
public class exam27 {

	// 내 풀이
	public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i+=n) {
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
	    Double length = Math.ceil(num_list.length/(n*1.0));
        int[] answer = new int[length.intValue()];

        for(int idx=0; idx<length; idx++) {
            answer[idx] = num_list[idx*n];
        }

        return answer;
	} */

}
