package level2.exam50_59;

/*
 * 문제 이름 : 2 x n 타일링
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12900
 * */
public class exam52 {

    // 나의 풀이
    public int solution(int n) {
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;

        for(int i=2;i<n;i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1_000_000_007;
        }

        return arr[n - 1];
    }
}
