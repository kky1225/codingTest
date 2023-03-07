package level0.exam20_29;

/*
 * 문제 이름 : 짝수 홀수 개수
 * 문제 설명 : 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : [1, 2, 3, 4, 5]에는 짝수가 2, 4로 두 개, 홀수가 1, 3, 5로 세 개 있습니다.
 * 입출력 예 : [1, 3, 5, 7]에는 짝수가 없고 홀수가 네 개 있습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120824
 * 
 * */
public class exam21 {

	// 내 풀이
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];

		for(int i : num_list){
            if(i % 2 == 0)
                answer[0] += 1;
            else
                answer[1] += 1;
        }

        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
	    int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] num_list) {
	    return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
	} */
	
}
