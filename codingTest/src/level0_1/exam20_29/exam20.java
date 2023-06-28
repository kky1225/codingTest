package level0_1.exam20_29;

/*
 * 문제 이름 : 길이에 따른 연산
 * 문제 설명 : 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 리스트의 길이가 13이므로 모든 원소의 합인 51을 return합니다.
 * 입출력 예 : 리스트의 길이가 4이므로 모든 원소의 곱인 120을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181879
 * 
 * */
public class exam20 {

	// 내 풀이
	public int solution(int[] num_list) {
        boolean bool = false;
        int answer = 1;
        
        if(num_list.length > 10) {
            bool = true;
            answer = 0;
        }
        
        for(int num : num_list) {
            if(bool) {
                answer += num;
            }else {
                answer *= num;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] num_list) {
	    int answer = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer *= num_list[i];
            }else{
                answer += num_list[i];
            }

        }

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] num_list) {
	    IntStream stream = IntStream.of(num_list);
        return num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b);
	} */

}
