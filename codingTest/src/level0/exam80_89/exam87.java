package level0.exam80_89;

/*
 * 문제 이름 : 등수 매기기
 * 문제 설명 : 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 평균은 각각 75, 70, 55, 65 이므로 등수를 매겨 [1, 2, 4, 3]을 return합니다.
 * 입출력 예 : 평균은 각각 75, 75, 40, 95, 95, 100, 20 이므로 [4, 4, 6, 2, 2, 1, 7] 을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120882
 * 
 * */
public class exam87 {

	// 내 풀이
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		int[] sumScore = new int[score.length];
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			
			sumScore[i] = sum;
		}
		
		for(int i=0; i<sumScore.length; i++) {
			int rank = 1;
			
			for(int j=0; j<sumScore.length; j++) {
				if(sumScore[j] > sumScore[i]) {
					rank++;
				}
			}
			
			answer[i] = rank;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int[] solution(int[][] score) {
	    return Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(d) + 1).toArray();
	} */
	
}
