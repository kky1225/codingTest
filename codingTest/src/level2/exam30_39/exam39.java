package level2.exam30_39;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/*
 * 문제 이름 : 더 맵게
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42626
 * */
public class exam39 {

	// 내 풀이
	public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        int count = 0;

        while(true) {
            if(queue.size() < 2 && queue.peek() < K) {
                return -1;
            }

            if(queue.peek() >= K) {
                return count;
            }

            queue.add(queue.poll() + queue.poll() * 2);
            count += 1;
        }
    }
		
	
	// 남의 풀이
	/* public int solution(int[] scoville, int K) {
         PriorityQueue<Integer> pqScov = new PriorityQueue<>();
         for (int s: scoville) {
             pqScov.add(s);
         }

         int cnt = 0;
         while (pqScov.size() > 1 && pqScov.peek() < K) {
             pqScov.add(pqScov.remove() + pqScov.remove() * 2);
             cnt++;
         }

         return pqScov.peek() >= K ? cnt : -1;
    } */

}
