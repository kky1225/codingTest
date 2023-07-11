package level0_1.exam60_69;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열 만들기 3
 * 문제 설명 : 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다. intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다. 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181895
 * 
 * */
public class exam69 {

	// 내 풀이
	public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<intervals.length;i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            for(int j=start;j<=end;j++) {
                list.add(arr[j]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public String[] solution(String[] strArr) {
	    return Arrays.stream(intervals).flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1))).toArray();
	} */
	
}
