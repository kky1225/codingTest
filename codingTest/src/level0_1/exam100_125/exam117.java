package level0_1.exam100_125;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 무작위로 K개의 수 뽑기
 * 문제 설명 : 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다. 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
			정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요. 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181858
 * 
 * */
public class exam117 {

	// 내 풀이
	public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        
        for(int i : arr) {
            if(count >= k) {
                break;
            }
            
            boolean overlap = false;
            
            for(int j=0;j<list.size();j++) {
                if(i == list.get(j)) {
                    overlap = true;
                    break;
                }
            }
            
            if(!overlap) {
                list.add(i);
                count++;
            }
        }
        
        for(int i=list.size();i<k;i++) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int k) {
	    return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int k) {
	    Set<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                answer[count++] = arr[i];
                set.add(arr[i]);
            }
            if(count == answer.length){
                break;
            }
        }
        return answer;
	} */
	
}
