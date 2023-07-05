package level0_1.exam40_49;

/*
 * 문제 이름 : flag에 따라 다른 값 반환하기
 * 문제 설명 : 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.
 * 입출력 예 : 예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * 
 * */
public class exam45 {

	// 내 풀이
	public int solution(int a, int b, boolean flag) {
        if(flag) {
            return a + b;
        }
        
        return a - b;
    }
	
	// 남의 풀이
	/* public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    } */

}
