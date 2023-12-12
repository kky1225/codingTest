package level2.exam40_49;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 문제 이름 : 주식가격
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42584
 * */
public class exam43 {

	// 내 풀이
	public int[] solution(int[] prices) {
        List<Integer> list = Arrays.stream(prices).boxed().collect(Collectors.toList());
        int[] answer = new int[prices.length];
        
        for(int i=0;i<list.size()-1;i++) {
            int count = 0;

            for(int j=i+1;j<list.size();j++) {
                count++;
                
                if(list.get(i) > list.get(j)) {
                    break;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
		
	
	// 남의 풀이
	/* public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] prices) {
	    Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
	} */

}
