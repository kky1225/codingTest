package level0_1.exam70_79;

/*
 * 문제 이름 : 두 수의 연산값 비교하기
 * 문제 설명 : 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
			12 ⊕ 3 = 123
			3 ⊕ 12 = 312
			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요. 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181938
 * 
 * */
public class exam70 {

	// 내 풀이
	public int solution(int a, int b) {
        int cal1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int cal2 = 2 * a * b;
        
        return cal1 > cal2 ? cal1 : cal2;
    }
	
	// 남의 풀이
	/* public int solution(int a, int b) {
	    return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
	} */
	
}
