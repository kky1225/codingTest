package level1.exam50_59;

import java.util.Arrays;

/*
 * 문제 이름 : 과일 장수
 * 문제 설명 : 과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.
			과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)
			예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면, 다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
			사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
			k	m	score	result
 * 입출력 예 : 3, 4, [1, 2, 3, 1, 2, 3, 1], 8
 * 입출력 예 : 4, 3, [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2], 33
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12921
 * 
 * */
public class exam53 {

	// 내 풀이
	public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int answer = 0;
        
        for(int i=score.length%m;i<score.length-1;i+=m) {
            answer += score[i] * m;
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
