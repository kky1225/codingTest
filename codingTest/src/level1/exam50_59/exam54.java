package level1.exam50_59;

import java.util.Arrays;

/*
 * 문제 이름 : 실패율
 * 문제 설명 : 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.
			이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.
			전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
			N	stages	result
 * 입출력 예 : 5, [2, 1, 2, 6, 2, 4, 3, 3], [3,4,2,1,5]
 * 입출력 예 : 4, [4,4,4,4,4], [4,1,2,3]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * 
 * */
public class exam54 {

	// 내 풀이
	public int[] solution(int N, int[] stages) {
        double[] failure = new double[N];
        double[] origin = new double[N];
        
        int total = stages.length;
        int count = 0;
        
        for(int i=1;i<=N;i++) {
            total -= count;
            count = 0;
            for(int j=0;j<stages.length;j++) {
                if(stages[j] == i) {
                    count += 1;
                }
            }
            
            if(total == 0) {
                failure[i - 1] = 1;
                origin[i - 1] = 1;
            }else {
                failure[i - 1] = (double)count / (double)total;
                origin[i - 1] = (double)count / (double)total;
            }
        }
        
        Arrays.sort(failure);
        
        int[] answer = new int[N];
        
        for(int i=0;i<failure.length-1;i++) {
        	int rank = 0;
            for(int j=0;j<origin.length;j++) {
            	rank += 1;
            	if (failure[i] == origin[j] ) {
            		answer[i] = rank;
            		failure[i] = -1;
                }
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(int k, int m, int[] score) {
	    if (score.length < m) {
            return 0;
        }
        int numSaleApple = m * (score.length / m);
        List<Integer> collect = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(numSaleApple)
                .collect(Collectors.toList());
        return IntStream.range(0, collect.size())
                .filter(i -> i % m == m - 1)
                .map(collect::get)
                .reduce(Integer::sum)
                .getAsInt() * m;
	} */
	
}
