package level0_1.exam30_39;

/*
 * 문제 이름 : 첫 번째로 나오는 음수
 * 문제 설명 : 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
 * 입출력 예 : 5번 인덱스에서 음수가 처음 등장하므로 5를 return합니다.
 * 입출력 예 : 음수가 없으므로 -1을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181896
 * 
 * */
public class exam30 {

	// 내 풀이
	public int solution(int[] num_list) {
        int answer = -1;
        
        for(int i=0;i<num_list.length;i++) {
            if(num_list[i] < 0) {
                return answer = i;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String num_str) {
        final int LENGTH = num_list.length;

        return IntStream.range(0, LENGTH).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
    } */

}
