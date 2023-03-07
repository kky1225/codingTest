package level0.exam20_29;

/*
 * 문제 이름 : 중복된 숫자 개수
 * 문제 설명 : 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : [1, 1, 2, 3, 4, 5] 에는 1이 2개 있습니다.
 * 입출력 예 : [0, 2, 3, 4] 에는 1이 0개 있습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120583
 * 
 * */
public class exam20 {

	// 내 풀이
	public int solution(int[] array, int n) {
		int answer = 0;

        for(int i : array){
            if(i==n)
                answer++;
        }

        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] array, int n) {
	    return (int) Arrays.stream(array)
                .filter(e -> e == n)
                .count();
	} */
	
}
