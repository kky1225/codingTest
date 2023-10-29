package level2.exam20_29;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/*
 * 문제 이름 : 프로세스
 * 문제 설명 : 운영체제의 역할 중 하나는 컴퓨터 시스템의 자원을 효율적으로 관리하는 것입니다. 이 문제에서는 운영체제가 다음 규칙에 따라 프로세스를 관리할 경우 특정 프로세스가 몇 번째로 실행되는지 알아내면 됩니다.
			1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
			2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
			3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
			  3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
			예를 들어 프로세스 4개 [A, B, C, D]가 순서대로 실행 대기 큐에 들어있고, 우선순위가 [2, 1, 3, 2]라면 [C, D, A, B] 순으로 실행하게 됩니다.
			현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와, 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location이 매개변수로 주어질 때, 해당 프로세스가 몇 번째로 실행되는지 return 하도록 solution 함수를 작성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42587
 * */
public class exam28 {

	// 내 풀이
	public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>(Arrays.stream(priorities).boxed().collect(Collectors.toList()));
        int answer = 0;
        int index = location;

        while(true) {
            int max = queue.stream().mapToInt(i -> i).max().getAsInt();
        
            if(queue.peek() == max) {
                answer += 1;
                
                if(index == 0) {
                    break;
                }
            }else {
                queue.offer(queue.peek());
            }
            
            queue.poll();

            index = index - 1 >= 0 ? index - 1 : queue.size() - 1;
        }

        return answer;
    }
    
	
	// 남의 풀이
	/* public int solution(int[] priorities, int location) {
	    int answer = 0;
	    int l = location;

	    Queue<Integer> que = new LinkedList<Integer>();
	    for(int i : priorities){
	        que.add(i);
	    }

	    Arrays.sort(priorities);
	    int size = priorities.length-1;



	    while(!que.isEmpty()){
	        Integer i = que.poll();
	        if(i == priorities[size - answer]){
	            answer++;
	            l--;
	            if(l <0)
	                break;
	        }else{
	            que.add(i);
	            l--;
	            if(l<0)
	                l=que.size()-1;
	        }
	    }

	    return answer;
	} */

}