package level0.exam90_99;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 문제 이름 : 최빈값 구하기
 * 문제 설명 : 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 * 입출력 예 : [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
 * 입출력 예 : [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120812
 * 
 * */
public class exam92 {

	// 내 풀이
	public int solution(int[] array) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : array) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}else {
				map.put(i, 1);
			}
		}
		
		int maxKey = 0;
		int maxValue = Collections.max(map.values());
		int cnt = 0;
		
		for(Integer key : map.keySet()) {
			if(map.get(key) > maxKey) {
				maxKey = map.get(key);
				answer = key;
			}
			
			if(map.get(key) == maxValue) {
				cnt++;
			}
		}
		
		if(cnt > 1) answer = -1;
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int[] array) {
	 	int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(int[] array) {
	 	List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.groupingBy(o -> o)).entrySet()).stream().sorted((t0, t1) -> Integer.compare(t1.getValue().size(), t0.getValue().size())).collect(Collectors.toList());
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
	} */
	
}
