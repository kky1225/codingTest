package level0_1.exam10_19;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 마지막 두 원소
 * 문제 설명 : 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.
 * 입출력 예 : 마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181927
 * 
 * */
public class exam18 {

	// 내 풀이
	public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : num_list) {
            list.add(num);
        }
        
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            list.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        }
        
        if(num_list[num_list.length - 1] <= num_list[num_list.length - 2]) {
            list.add(num_list[num_list.length - 1] * 2);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
	    int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }

        answer[num_list.length] = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1]-num_list[num_list.length-2]:num_list[num_list.length-1]*2;
        return answer;
	} */

}
