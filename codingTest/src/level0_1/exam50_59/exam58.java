package level0_1.exam50_59;

/*
 * 문제 이름 : 홀짝에 따라 다른 값 반환하기
 * 문제 설명 : 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
 * 입출력 예 : 예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 22 + 42 + 62 + 82 + 102 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181935
 * 
 * */
public class exam58 {

	// 내 풀이
	public int solution(int n) {
        boolean bool = false;
        
        if(n % 2 == 0) {
            bool = true;
        }
        
        int answer = 0;
        
        for(int i=1;i<=n;i++) {
            if(bool && i % 2 == 0) {
                answer += i * i;
            }else if(!bool && i % 2 != 0) {
                answer += i;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
	    if(n%2 == 0) {
            return IntStream.rangeClosed(1,n).filter(i->i%2==0).map(i->(int) Math.pow(i,2)).sum();
        }
        return IntStream.rangeClosed(1,n).filter(i->i%2==1).sum();
	} */
	
	// 남의 풀이
	/* public int solution(int n) {
	    return n % 2 != 0 ? IntStream.iterate(1, i -> i <= n, i -> i + 2).sum() : (int) IntStream.iterate(2, i -> i <= n, i -> i + 2).mapToDouble(operand -> Math.pow(operand, 2)).sum();
	} */
	
}
