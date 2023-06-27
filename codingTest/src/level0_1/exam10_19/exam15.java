package level0_1.exam10_19;

/*
 * 문제 이름 : 이어 붙인 수
 * 문제 설명 : 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.
 * 입출력 예 : 홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181928
 * 
 * */
public class exam15 {

	// 내 풀이
	public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for(int num : num_list) {
            if(num % 2 != 0) {
                odd.append(num);
            }else {
                even.append(num);
            }
        }
        
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
	
	// 남의 풀이
	/* public int solution(int[] num_list) {
	    return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));
	} */

}
