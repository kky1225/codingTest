package level0.exam90_99;

/*
 * 문제 이름 : 겹치는 선분의 길이
 * 문제 설명 : 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 두 번째, 세 번째 선분 [2, 5], [3, 9]가 [3, 5] 구간에 겹쳐있으므로 2를 return 합니다.
 * 입출력 예 : 겹친 선분이 없으므로 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120876
 * 
 * */
public class exam98 {

	// 내 풀이
	public int solution(int[][] lines) {
		int answer = 0;
        int cnt = 0;
		
        for(int i=-100; i<=100; i++){
        	cnt = 0;
        	
        	if(lines[0][0] <= i && lines[0][1] > i)
        		cnt++;
        	
        	if(lines[1][0] <= i && lines[1][1] > i)
        		cnt++;
        	
        	if(lines[2][0] <= i && lines[2][1] > i)
        		cnt++;
        	
        	if(cnt > 1)
        		answer++;
        	
        }
        
        return answer;
    }
	
    // 남의 풀이
	/* public int solution(int[][] lines) {
		Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<lines.length; i++) {
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);

            for (int j=min; j<max; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }

        return answer;
    } */
	
	// 남의 풀이
		/* public int solution(int[][] lines) {
			Map<Integer, Integer> map = new HashMap<>();
	        for (int[] line : lines) {
	            int from = Math.min(line[0], line[1]);
	            int to = Math.max(line[0], line[1]);
	            for (int i = from; i < to; i++) {
	                map.merge(i, 1, Integer::sum);
	            }
	        }
	
	        return (int) map.values().stream().filter(i -> i > 1).count();
	    } */
	
}
