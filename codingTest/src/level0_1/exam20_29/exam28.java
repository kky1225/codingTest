package level0_1.exam20_29;

/*
 * 문제 이름 : 원소들의 곱과 합
 * 문제 설명 : 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.
 * 입출력 예 : 모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181929
 * 
 * */
public class exam28 {

	// 내 풀이
	public int solution(int[] num_list) {
        int mul = 1;
        int pow = 0;
        
        for(int num : num_list) {
            mul *= num;
            pow += num;
        }
        
        pow = pow * pow;
        
        return mul < pow ? 1 : 0;
    }
	
	// 남의 풀이
	/* public int solution(int[] numList) {
	    int answer = 0;

        int sum  = 0;
        int mult = 1;

        for(int i : num_list) {
            sum += i;
            mult *= i;
        }

        answer = Math.pow(sum,2) > mult ? 1 : 0;

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] numList) {
        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
    } */

}
