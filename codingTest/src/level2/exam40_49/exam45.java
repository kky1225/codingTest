package level2.exam40_49;

import java.util.Arrays;

/*
 * 문제 이름 : 땅따먹기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12913
 * */
public class exam45 {

	// 내 풀이
    int solution(int[][] land) {
        int[][] dp = land.clone();

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] += Math.max(dp[i - 1][1], Math.max(dp[i - 1][2], dp[i - 1][3]));
            dp[i][1] += Math.max(dp[i - 1][0], Math.max(dp[i - 1][2], dp[i - 1][3]));
            dp[i][2] += Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][3]));
            dp[i][3] += Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));
        }

        return Arrays.stream(dp[dp.length - 1]).max().getAsInt();
    }
		
	
	// 남의 풀이
	/* int solution(int[][] land) {

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                int max1 = Arrays.stream(land[i-1], 0, j).max().orElse(0);
                int max2 = Arrays.stream(land[i-1], j+1, land[0].length).max().orElse(0);
                land[i][j] += Math.max(max1, max2);
            }
        }

        return Arrays.stream(land[land.length-1]).max().getAsInt();
    } */

}
