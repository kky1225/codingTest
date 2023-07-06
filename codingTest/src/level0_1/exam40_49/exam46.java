package level0_1.exam40_49;

/*
 * 문제 이름 : 주사위 게임 1
 * 문제 설명 : 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
			a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
			a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
			a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
			두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번에서 두 주사위 숫자가 모두 홀수이므로 32 + 52 = 9 + 25 = 34점을 얻습니다. 따라서 34를 return 합니다.
 * 입출력 예 : 예제 2번에서 두 주사위 숫자 중 하나만 홀수이므로 2 × (6 + 1) = 2 × 7 = 14점을 얻습니다. 따라서 14를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * 
 * */
public class exam46 {

	// 내 풀이
	public int solution(int a, int b) {
        if(a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;
        }
        
        if(a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        }
        
        return Math.abs(a - b);
    }
	
	// 남의 풀이
	/* public int solution(int a, int b) {
        return a % 2 != 0 && b % 2 != 0 ? (int) (Math.pow(a, 2) + Math.pow(b, 2)) : a % 2 != 0 || b % 2 != 0 ? 2 * (a + b) : Math.abs(a - b);
    } */

}
