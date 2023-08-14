package level0_1.exam100_125;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열 만들기 2
 * 문제 설명 : 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요. 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181921
 * 
 * */
public class exam120 {

	// 내 풀이
	public int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++) {
            String iStr = String.valueOf(i);
            boolean check = true;
            
            for(char iChar : iStr.toCharArray()) {
                if(!String.valueOf(iChar).contains("0") && !String.valueOf(iChar).contains("5")) {
                    check = false;
                }
            }
            
            if(check) {
                list.add(i);
            }
        }
        
        if(list.size() == 0) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int l, int r) {
	    ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int l, int r) {
	    int[] answer = IntStream.rangeClosed(l, r).filter(i -> {
            while (i > 0) {
                if (i % 5 != 0) return false;
                i /= 10;
            }
            return true;
        }).toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
	} */
	
}
