package level1.exam70_79;

/*
 * 문제 이름 : 공원 산책
 * 문제 설명 : 지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다. ["방향 거리", "방향 거리" … ]
 			예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.
 			주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
			주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
 			위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다. 공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
 			공원을 나타내는 문자열 배열 park, 로봇 강아지가 수행할 명령이 담긴 문자열 배열 routes가 매개변수로 주어질 때, 로봇 강아지가 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아 return 하도록 solution 함수를 완성해주세요.
			park		routes		result
 * 입출력 예 : ["SOO","OOO","OOO"]	["E 2","S 2","W 1"]	[2,1]
 * 입출력 예 : ["SOO","OXX","OOO"]	["E 2","S 2","W 1"]	[0,1]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/172928
 * 
 * */
public class exam75 {

	// 내 풀이
	public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        
        for(int i=0;i<park.length;i++) {
            for(int j=0;j<park[i].length();j++) {
                if(park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        for(String route : routes) {
            String[] routeArr = route.split(" ");
            
            int endIndex = Integer.parseInt(routeArr[1]);
            
            int originX = x;
            int originY = y;
            
            for(int i=0;i<endIndex;i++) {
                if(routeArr[0].equals("E")) {
                    if(y < park[x].length() - 1 && park[x].charAt(y + 1) != 'X') {
                        y += 1;
                    }else {
                        x = originX;
                        y = originY;
                        break;
                    }
                }
                
                if(routeArr[0].equals("S")) {
                    if(x < park.length - 1 && park[x + 1].charAt(y) != 'X') {
                        x += 1;
                    }else {
                        x = originX;
                        y = originY;
                        break;
                    }
                }
                
                if(routeArr[0].equals("W")) {
                    if(y > 0 && park[x].charAt(y - 1) != 'X') {
                        y -= 1;
                    }else {
                        x = originX;
                        y = originY;
                        break;
                    }
                }
                
                if(routeArr[0].equals("N")) {
                    if(x > 0 && park[x - 1].charAt(y) != 'X') {
                        x -= 1;
                    }else {
                        x = originX;
                        y = originY;
                        break;
                    }
                }
            }
        }
        
        int[] answer = {x, y};
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String[] park, String[] routes) {
		char[][] map = new char[park.length][park[0].length()];

        Pos start = new Pos(0, 0);
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                map[i][j] = park[i].charAt(j);
                if(map[i][j] == 'S'){
                    start.setPos(i, j);
                }
            }
        }

        HashMap<String, int[]> hash = new HashMap<>();
        hash.put("E", new int[]{0, 1});
        hash.put("S", new int[]{1, 0});
        hash.put("N", new int[]{-1, 0});
        hash.put("W", new int[]{0, -1});

        loop:
        for(int i=0; i<routes.length; i++){
            String[] cur = routes[i].split(" ");

            int dir[] = hash.get(cur[0]);

            int ny = start.y, nx = start.x ;
            for(int j=0; j<Integer.parseInt(cur[1]); j++){
                ny +=  dir[0];
                nx +=  dir[1];

                if(ny < 0 || ny >= map.length || nx <0 || nx >= map[0].length || map[ny][nx] == 'X')
                    continue loop;
            }

            start.setPos(ny, nx);
        }

        return new int[] {start.y, start.x};
    }
    
    class Pos{
	    int y, x;
	
	    public Pos(int y, int x){
	        this.y = y;
	        this.x =x;
	    }
	
	    public void setPos(int y, int x){
	        this.y = y;
	        this.x = x;
	    }
	} */
	
}
