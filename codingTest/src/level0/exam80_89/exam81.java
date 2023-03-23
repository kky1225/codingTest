package level0.exam80_89;

/*
 * 문제 이름 : 캐릭터의 좌표
 * 문제 설명 : 머쓱이는 RPG게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다. 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다. 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
 * 			[0, 0]은 board의 정 중앙에 위치합니다. 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
 * 입출력 예 : ["left", "right", "up", "right", "right"] : [0, 0]에서 왼쪽으로 한 칸 오른쪽으로 한 칸 위로 한 칸 오른쪽으로 두 칸 이동한 좌표는 [2, 1]입니다.
 * 입출력 예 : ["down", "down", "down", "down", "down"] : [0, 0]에서 아래로 다섯 칸 이동한 좌표는 [0, -5]이지만 맵의 세로 크기가 9이므로 아래로는 네 칸을 넘어서 이동할 수 없습니다. 따라서 [0, -4]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120869
 * 
 * */
public class exam81 {

	// 내 풀이
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];
		int width = board[0] / 2;
		int height = board[1] / 2;
		
		for(String s : keyinput) {
			if(s.equals("right") && answer[0] < width) 
				answer[0] += 1;
			else if(s.equals("left") && answer[0] > -width) 
				answer[0] -= 1;
			else if(s.equals("up") && answer[1] < height) 
				answer[1] += 1;
			else if(s.equals("down") && answer[1] > -height) 
				answer[1] -= 1;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int[] solution(String[] keyinput, int[] board) {
	    int numRow = board[1];
        int numCol = board[0];
        int r = 0;
        int c = 0;
        for (String key : keyinput) {
            switch (key.charAt(0)) {
                case 'l':
                    c = Math.max(-numCol / 2, c - 1);
                    break;
                case 'r':
                    c = Math.min(numCol / 2, c + 1);
                    break;
                case 'd':
                    r = Math.max(-numRow / 2, r - 1);
                    break;
                case 'u':
                    r = Math.min(numRow / 2, r + 1);
                    break;
            }
            System.out.println(r + " " + c);
        }
        return new int[]{c, r};
	} */
	
	// 남의 풀이
	/* public int[] solution(String[] keyInput, int[] board) {
        return Arrays.stream(keyInput).map(s -> getMap().get(s)).reduce((ints1, ints2) -> new int[] {
                Math.abs(ints1[0] + ints2[0]) > board[0] / 2 ? board[0] / 2 * (ints1[0] < 0 ? -1 : 1) : ints1[0] + ints2[0],
                Math.abs(ints1[1] + ints2[1]) > board[1] / 2 ? board[1] / 2 * (ints1[1] < 0 ? -1 : 1) : ints1[1] + ints2[1]
        }).orElse(new int[]{0, 0});
    }

    private Map<String, int[]> getMap() {
        Map<String, int[]> map = new HashMap<>();

        map.put("up", new int[] {0, 1});
        map.put("down", new int[] {0, - 1});
        map.put("left", new int[] {-1, 0});
        map.put("right", new int[] {1, 0});
        return map;
    } */
}
