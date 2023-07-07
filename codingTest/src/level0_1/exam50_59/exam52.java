package level0_1.exam50_59;

/*
 * 문제 이름 : 더 크게 합치기
 * 문제 설명 : 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 * 입출력 예 : a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
 * 입출력 예 : a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181939
 * 
 * */
public class exam52 {

	// 내 풀이
	public int solution(int a, int b) {
        String answer1 = String.valueOf(a) + String.valueOf(b);
        String answer2 = String.valueOf(b) + String.valueOf(a);
        
        return Math.max(Integer.parseInt(answer1), Integer.parseInt(answer2));
    }

}
