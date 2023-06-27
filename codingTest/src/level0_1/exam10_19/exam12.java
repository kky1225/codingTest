package level0_1.exam10_19;

/*
 * 문제 이름 : 정수 찾기
 * 문제 설명 : 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [1, 2, 3, 4, 5] 안에 3이 있으므로 1을 return합니다.
 * 입출력 예 : [15, 98, 23, 2, 15] 안에 20이 없으므로 0을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181840
 * 
 * */
public class exam12 {

	// 내 풀이
	public int solution(int[] num_list, int n) {
        for(int num : num_list) {
            if(num == n) {
                return 1;
            }
        }
        
        return 0;
    }
	
	// 남의 풀이
	/* public int solution(int[] num_list, int n) {
	    return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
	} */

}
