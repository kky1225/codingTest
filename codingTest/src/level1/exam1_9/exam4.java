package level1.exam1_9;

/*
 * 문제 이름 : 자릿수 더하기
 * 문제 설명 : 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요. 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * 입출력 예 : 1 + 2 + 3 = 6이므로 6을 return 하면 됩니다.
 * 입출력 예 : 9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * 
 * */
public class exam4 {

	// 내 풀이
	public int solution(int n) {
        int answer = 0;
        int max = 100000000;
        
        while(n > 0){
            answer += n / max;
            n %= max;
            max /= 10;
        }

        return answer;
    }
	
    // 남의 풀이
	/* public int solution(int n) {
		int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    } */
	
}
