package level0_1.exam1_9;

/*
 * 문제 이름 : 수 조작하기 1
 * 문제 설명 : 정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
 * 입출력 예 : 수 n은 control에 따라 다음과 같은 순서로 변하게 됩니다. 0 → 1 → 0 → 10 → 0 → 1 → 0 → 10 → 0 → -1 → -2 → -1 따라서 -1을 return 합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181926
 * 
 * */
public class exam8 {

	// 내 풀이
	public int solution(int n, String control) {
        for(char c : control.toCharArray()) {
            switch (c) {
                case 'w' :
                    n += 1;
                    break;
                case 's' :
                    n -= 1;
                    break;
                case 'd' :
                    n += 10;
                    break;
                case 'a' :
                    n -= 10;
                    break;
            }
        }
        
        return n;
    }
	
	// 남의 풀이
	/* public int solution(int n, String control) {
	    return control.chars().reduce(n, (acc, c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
	} */

}
