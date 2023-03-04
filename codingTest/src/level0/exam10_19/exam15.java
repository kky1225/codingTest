package level0.exam10_19;

/*
 * 문제 이름 : 배열 뒤집기
 * 문제 설명 : 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
 * 입출력 예 : num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120821
 * 
 * */
public class exam15 {

	// 내 풀이
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
	        
		for(int i=0; i<num_list.length; i++)
            answer[i] = num_list[num_list.length - i - 1];
	        
	    return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    } */
	
}
