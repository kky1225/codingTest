package level0.exam50_59;

/*
 * 문제 이름 : 합성수 찾기
 * 문제 설명 : 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
 * 입출력 예 : 15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120846
 * 
 * */
public class exam59 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) 
				if(i % j == 0) 
					cnt++;
			
			if(cnt > 2) 
				answer++;
			
			cnt = 0;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int n) {
	    int answer = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt >= 3) answer++;
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int n) {
	    return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
	} */
	
}
