package level0.exam20_29;

/*
 * 문제 이름 : 점의 위치 구하기
 * 문제 설명 : 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
 * 입출력 예 : dot이 [2, 4]로 x 좌표와 y 좌표 모두 양수이므로 제 1 사분면에 속합니다. 따라서 1을 return 합니다.
 * 입출력 예 : dot이 [-7, 9]로 x 좌표가 음수, y 좌표가 양수이므로 제 2 사분면에 속합니다. 따라서 2를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120841
 * 
 * */
public class exam22 {

	// 내 풀이
	public int solution(int[] dot) {
		int answer = 0;

		if(dot[0] > 0 && dot[1] > 0)
            answer = 1;
        else if(dot[0] < 0 && dot[1] > 0)
            answer = 2;
        else if(dot[0] < 0 && dot[1] < 0)
            answer = 3;
        else if(dot[0] > 0 && dot[1] < 0)
            answer = 4;

        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] dot) {
	    int answer = 0;

        if(dot[0]>0){
            if(dot[1]>0) answer = 1;
            if(dot[1]<0) answer = 4;
        }else {
            if(dot[1]>0) answer = 2;
            if(dot[1]<0) answer = 3;
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] dot) {
	    return dot[0] > 0 && dot[1] > 0 ? 1 : dot[0] < 0 && dot[1] > 0 ? 2 : dot[0] > 0 && dot[1] < 0 ? 4 : 3;
	} */
	
}
