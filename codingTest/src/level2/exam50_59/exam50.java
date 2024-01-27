package level2.exam50_59;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 숫자 변환하기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/154538
 * */
public class exam50 {

    // 나의 풀이
    private static final int MAX = Integer.MAX_VALUE;

    public int solution(int x, int y, int n) {
        int[] arr = new int[y + 1];

        for(int i=x+1;i<=y;i++) {
            int x1 = remain(i, 2) && smallNum(i / 2, x) ? arr[i / 2] : MAX;
            int x2 = remain(i, 3) && smallNum(i / 3, x) ? arr[i / 3] : MAX;
            int x3 = smallNum(i - n, x) ? arr[i - n] : MAX;

            int min = Math.min(Math.min(x1, x2), x3);

            if(min < MAX) {
                arr[i] = min + 1;
            }else {
                arr[i] = MAX;
            }
        }

        if(arr[y] == MAX) {
            return -1;
        }

        return arr[y];
    }

    public boolean remain(int target, int num) {
        return target / num > 0 && target % num == 0;
    }

    public boolean smallNum(int target, int num) {
        return target >= num;
    }

    //남의 풀이
    /*
    int[] dp = new int[3000003];
    int INF = 1000002;

    public int solution(int x, int y, int n) {
        int answer = 0;
        Arrays.fill(dp, INF);
        dp[x] = -1;
        dp[y] = 0;
        for(int num = Math.max(y - n, Math.max(y / 2, y / 3)); num >= x; num--){
            dp[num] = Math.min(dp[num + n] + 1, Math.min(dp[num * 2] + 1, dp[num * 3] + 1));
        }
        return dp[x] >= INF ? -1 : dp[x];
    }
     */

}
