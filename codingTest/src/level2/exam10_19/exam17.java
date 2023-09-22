package level2.exam10_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 문제 이름 : 귤 고르기
 * 문제 설명 : 경화는 과수원에서 귤을 수확했습니다. 경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다. 그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고 싶습니다.
			예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다. 경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면, 귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.
			경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다. 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/138476
 * */
public class exam17 {

	// 내 풀이
	public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int answer = 0;
        
        for(int i : list) {
            k -= i;
            answer++;
            
            if(k <= 0) {
                break;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map =new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2)-map.get(o1));

        for(Integer key:list){
            k -=map.get(key);
            answer++;
            if(k<=0){
                break;
            }
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tangerineCountMap = new HashMap<>();

        for (int nowTangerine : tangerine) {
            Integer count = tangerineCountMap.getOrDefault(nowTangerine, 0) + 1;
            tangerineCountMap.put(nowTangerine, count);
        }
        List<Map.Entry<Integer, Integer>> collect = tangerineCountMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList());

        int type = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> each : collect) {
            count += each.getValue();
            type++;
            if (count >= k) {
                return type;
            }
        }

        return type;
    } */

}
