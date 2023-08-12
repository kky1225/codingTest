package level0_1.exam100_125;

import java.util.Arrays;

/*
 * 문제 이름 : 전국 대회 선발 고사
 * 문제 설명 : 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
			각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다. 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181851
 * 
 * */
public class exam119 {

	// 내 풀이
	public int solution(int[] rank, boolean[] attendance) {
        int[] rankSorts = Arrays.copyOf(rank, rank.length);
        Arrays.sort(rankSorts);
        
        int[] answer = new int[3];
        int index = 0;
        
        for(int rankSort : rankSorts) {
            if(index > 2) {
                break;
            }
            
            for(int j=0;j<rank.length;j++) {
                if(rankSort == rank[j] && attendance[j]) {
                    answer[index++] = j;
                    break;
                }
            }
        }
        
        return answer[0] * 10000 + answer[1] * 100 + answer[2];
    }
	
	// 남의 풀이
	/* public int solution(int[] rank, boolean[] attendance) {
	    return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3L)
                .reduce((current, next) -> current * 100 + next)
                .get();
	} */
	
	// 남의 풀이
	/* public int solution(int[] rank, boolean[] attendance) {
	    PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }

        return que.poll() * 10000 + que.poll() * 100 + que.poll();
	} */
	
}
