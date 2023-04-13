package level1.exam1_9;

/*
 * 문제 이름 : 나머지가 1이 되는 수 찾기
 * 문제 설명 : 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.
 * 입출력 예 : 10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
 * 입출력 예 : 12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * 
 * */
public class exam7 {

	// 내 풀이
	public int solution(int n) {
		int answer = 1;
        
        while(n % answer != 1)
            answer++;
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
	} */
	
}
