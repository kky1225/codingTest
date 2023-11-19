package level2.exam30_39;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 문제 이름 : 게임 맵 최단거리
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/1844
 * */
public class exam38 {

	// 내 풀이
	public int solution(int[][] maps) {
        int answer = bfs(maps);
        return answer;
    }

    public int bfs(int[][] maps) {
        int cnt = 0;
        int xSize = maps[0].length;
        int ySize = maps.length;

        int[][] visited = new int[ySize][xSize];

        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{0, 0});

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size ; i++) {
                int[] point = q.poll();
                int x = point[1];
                int y = point[0];

                // 방문한 좌표인지 아닌지 체크합니다 엿먹으세요
                if (visited[y][x] == 1) {
                    continue;
                }

                // 방문 체크
                visited[y][x] = 1;

                // 현재의 위치에서 이동 가능한 곳을 체크해서 하나씩 큐에 넣는다
                // ex) 현재 0,0 에서 아래로 한칸 가고싶다의 경우
                //    - 이동 후 나의 좌표는 (0, 1)
                //    - y값이 + 1 증가했다 라는 의미고
                //    - validation은
                //    - + 인 경우는 최대값을 넘어가면 안되고
                //    - - 인 경우는 최소값을 넘어가면 안돼
                if( (ySize > y + 1) &&  maps[y+1][x] != 0 ) {
                    q.add(new int[]{y+1,x});
                }

                if( (y-1 >= 0) &&  maps[y-1][x] != 0 ) {
                    q.add(new int[]{y-1, x});
                }

                if( (xSize > x+1) && maps[y][x+1] != 0 ) {
                    q.add(new int[]{y, x+1});
                }

                if( (x-1 >= 0) &&  maps[y][x-1] != 0 ) {
                    q.add(new int[]{y, x-1});
                }

                if( (xSize -1 == x ) && (ySize -1 == y) ) {
                    return cnt+1;
                    //q.clear();
                    //break;
                }
            }

            cnt++;
        }

        return -1;
    }
		
	
	// 남의 풀이
	/* public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // 시작 위치와 거리

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (row == rows - 1 && col == cols - 1) {
                return distance; // 목적지에 도달한 경우 최단거리 반환
            }

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && maps[newRow][newCol] == 1) {
                    maps[newRow][newCol] = 0; // 방문한 위치는 재방문하지 않도록 표시
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                }
            }
        } */

}
