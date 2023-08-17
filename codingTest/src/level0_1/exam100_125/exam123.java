package level0_1.exam100_125;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열 조각하기
 * 문제 설명 : 정수 배열 arr와 query가 주어집니다. query를 순회하면서 다음 작업을 반복합니다.
			짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
			홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
			위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181893
 * 
 * */
public class exam123 {

	// 내 풀이
	public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
            list.add(i);
        }
        
        for(int i=0;i<query.length;i++) {
            for(int j=0;j<list.size();j++) {
                if(i % 2 == 0) {
                    int startIndex = query[i] + 1;
                    int lastIndex = list.size();
                        
                    for(int k=startIndex;k<lastIndex;k++) {
                        list.remove(startIndex);
                    }
                }else {
                    for(int k=0;k<query[i];k++) {
                            list.remove(0);
                    }
                }
                
                break;
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int[] query) { 
	    return IntStream.range(0, query.length)
                .boxed()
                .reduce(arr, (current, next) -> next % 2 == 0 ?
                                Arrays.copyOfRange(current, 0, query[next] + 1) :
                                Arrays.copyOfRange(current, query[next], current.length),
                        (a, b) -> a);
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int[] query) { 
	    int[] answer = {};
        int f =0;
        int e=0;

        for(int i=0;i<query.length;i++){
            if(i%2==0) e=f+query[i];
            else f=f+query[i];
            }

        if(e-f==0) answer=new int[]{-1};
        else answer=Arrays.copyOfRange(arr,f,e);

        return answer;
	} */
	
}
