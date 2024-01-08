package level2.exam40_49;

import java.util.*;

/*
 * 문제 이름 : 롤케이크 자르기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/132265
 * */
public class exam47 {

	// 내 풀이
    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : topping) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 0);
            }
        }

        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int j : topping) {
            set.add(j);

            if (map.get(j) == 0) {
                map.remove(j);
            } else {
                map.put(j, map.get(j) - 1);
            }

            if (map.size() == set.size()) {
                answer++;
            }
        }

        return answer;
    }

	// 남의 풀이
	/* public int solution(int[] topping) {
        int answer = 0;
        int[] left = new int[10001], right = new int[10001];
        int ls = 0, rs = 0;
        for(var i : topping) right[i]++;
        for(var i : right) rs += i > 0 ? 1 : 0;
        for(var i : topping) {
            right[i]--;
            if (right[i] == 0) rs--;
            if (left[i] == 0) ls++;
            left[i]++;
            if (rs == ls) answer++;
        }
        return answer;
    } */

}
