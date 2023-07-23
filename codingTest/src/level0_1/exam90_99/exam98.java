package level0_1.exam90_99;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 리스트 자르기
 * 문제 설명 : 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
			n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
			n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
			n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
			n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
			올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181897
 * 
 * */
public class exam98 {

	// 내 풀이
	public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        if(n == 1) {
            for(int i=0;i<=slicer[1];i++) {
                list.add(num_list[i]);
            }
        }
        
        if(n == 2) {
            for(int i=slicer[0];i<num_list.length;i++) {
                list.add(num_list[i]);
            }
        }
        
        if(n == 3) {
            for(int i=slicer[0];i<=slicer[1];i++) {
                list.add(num_list[i]);
            }
        }
        
        if(n == 4) {
            for(int i=slicer[0];i<=slicer[1];i+=slicer[2]) {
                list.add(num_list[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int[] solution(int n, int[] slicer, int[] num_list) {
	    return IntStream.iterate(n == 1 ? 0 : slicer[0], i -> i <= (n == 2 ? numList.length - 1 : slicer[1]), i -> n == 4 ? i + slicer[2] : i + 1).map(i -> numList[i]).toArray();
	} */
	
}
