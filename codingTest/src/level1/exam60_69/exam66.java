package level1.exam60_69;

/*
 * 문제 이름 : [카카오 인턴] 키패드 누르기
 * 문제 설명 : 스마트폰 전화 키패드의 각 칸에 다음과 같이 숫자들이 적혀 있습니다.
			이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다. 맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다. 
			1. 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
			2. 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
			3. 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
			4. 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다. 4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
			순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 순서대로 눌러야 할 번호가 [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]이고, 오른손잡이입니다. 따라서 "LRLLLRLLRRL"를 return 합니다.
 * 입출력 예 : 왼손잡이가 [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]를 순서대로 누르면 사용한 손은 "LRLLRRLLLRR"이 됩니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/67256
 * 
 * */
public class exam66 {

	// 내 풀이
	public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int rLastNum = 12;
        int lLastNum = 10;
        
        for(int i : numbers) {
            i = i == 0 ? 11 : i;
            
            if(i == 1 || i == 4 || i == 7) {
                lLastNum = i;
                answer.append("L");
            }else if(i == 3 || i == 6 || i == 9) {
                rLastNum = i;
                answer.append("R");
            }else {
                int lDistance = Math.abs(i - lLastNum) / 3 + Math.abs(i - lLastNum) % 3;
                int rDistance = Math.abs(i - rLastNum) / 3 + Math.abs(i - rLastNum) % 3;
                    
                if(lDistance > rDistance) {
                    rLastNum = i;
                    answer.append("R");
                }
                
                if(lDistance < rDistance) {
                    lLastNum = i;
                    answer.append("L");
                }
                
                if(lDistance == rDistance) {
                    if(hand.equals("right")) {
                        rLastNum = i;
                        answer.append("R");
                    }else {
                        lLastNum = i;
                        answer.append("L");
                    }
                }
            }
        }
        
        return answer.toString();
    }
	
	// 남의 풀이
	/*
	int[][] numpadPos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };
    //초기 위치
    int[] leftPos = {3,0};
    int[] rightPos = {3,2};
    String hand;
    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";

        String answer = "";
        for (int num : numbers) {
            String Umji = pushNumber(num);
            answer += Umji;

            if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
            if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
        }
        return answer;
    }

    //num버튼을 누를 때 어디 손을 사용하는가
    private String pushNumber(int num) {
        if(num==1 || num==4 || num==7) return "L";
        if(num==3 || num==6 || num==9) return "R";

        // 2,5,8,0 일때 어디 손가락이 가까운가
        if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
        if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

        //같으면 손잡이
        return this.hand;
    }

    //해당 위치와 번호 위치의 거리
    private int getDist(int[] pos, int num) {
        return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
    } */
	
}
