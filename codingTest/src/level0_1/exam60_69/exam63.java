package level0_1.exam60_69;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열의 원소 삭제하기
 * 문제 설명 : 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181844
 * 
 * */
public class exam63 {

	// 내 풀이
	public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++) {
            boolean checkDelete = false;
            
            for(int delete : delete_list) {
                if(arr[i] == delete) {
                    checkDelete = true;
                    break;
                }
            }
            
            if(!checkDelete) {
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int[] delete_list) {
	    List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            list.add(n);
        }
        for(int n: delete_list) {
            list.remove((Integer)n);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int[] delete_list) {
	    return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
	} */
	
}
