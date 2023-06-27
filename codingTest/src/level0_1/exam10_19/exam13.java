package level0_1.exam10_19;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열 만들기 1
 * 문제 설명 : 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 입출력 예 : 1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.
 * 입출력 예 : 1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181901
 * 
 * */
public class exam13 {

	// 내 풀이
	public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++) {
            if(i % k == 0) {
                list.add(i);
            }
        }
    
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int n, int k) {
	    return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
	} */

}
