package level2.exam30_39;

/*
 * 문제 이름 : 피로도
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/87946
 * */
public class exam33 {

	// 내 풀이
	int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);

        return max;
    }
    
    public void dfs(int k, int[][] dungeons, boolean[] visited) {
        int count = 0;
        
        for(int i = 0; i<visited.length; i++) {
            if(visited[i]) {
                count += 1;
            }
        }
        
        if(count > max) {
            max = count;
        }


        for(int i = 0; i<dungeons.length; i++) {
            if(!visited[i]) {
                if(dungeons[i][0] <= k) {
                    visited[i] = true;
                    k -= dungeons[i][1];
                    
                    dfs(k, dungeons, visited);
                    
                    visited[i] = false;
                    k += dungeons[i][1];
                }
            }
        }
    }
		
	
	// 남의 풀이
	/* 
	public static boolean check[];
    public static int ans = 0;

    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return ans;
    }
    public static void dfs(int tired, int[][] dungeons, int cnt){
        for(int i=0; i<dungeons.length; i++){
            if(!check[i] && dungeons[i][0]<=tired){
                check[i] = true;
                dfs(tired-dungeons[i][1], dungeons, cnt+1);
                check[i] = false;
            }
        }
        ans = Math.max(ans, cnt);
    } */

}
