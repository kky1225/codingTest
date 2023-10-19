package level2.exam20_29;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 기능개발
 * 문제 설명 : 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다. 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
			먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/64065
 * */
public class exam27 {

	// 내 풀이
	public int[] solution(int[] progresses, int[] speeds) {
        int count = 0;
        int number = remainDay(progresses[0], speeds[0]);
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<progresses.length;i++) {
            progresses[i] = remainDay(progresses[i], speeds[i]);

            if(progresses[i] > number) {
                list.add(count);
                number = progresses[i];
                count = 0;
            }

            count += 1;
        }

        list.add(count);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int remainDay(int day, int speed) {
        day = (100 - day) / speed;

        if((100 - day) % speed > 0) {
            day += 1;
        }

        return day;
    }
    
	// 남의 풀이
	/* public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        int top = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            if (top >= queue.peek()) {
                count++;
                queue.poll();
            } else {
                answer.add(count);
                count = 1;
                top = queue.poll();
            }
        }
        answer.add(count);
        return answer;
    } */

}
