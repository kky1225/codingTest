package level0.exam80_89;

/*
 * 문제 이름 : 저주의 숫자 3
 * 문제 설명 : 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다. 10진법 : 1, 2, 3, 4, 5,6 , 7, 8, 9, 10 / 3x 마을에서 쓰는 숫자 : 1, 2, 4, 5, 7, 8, 10, 11, 14, 16
 * 입출력 예 : 15를 3x 마을의 숫자로 변환하면 25입니다.
 * 입출력 예 : 40을 3x 마을의 숫자로 변환하면 76입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120871
 * 
 * */
public class exam89 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int n) {
	 	int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    } */
	
}
