package level1.exam1_9;

/*
 * 문제 이름 : 정수 제곱근 판별
 * 문제 설명 : 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다. n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 * 입출력 예 : 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
 * 입출력 예 : 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12934
 * 
 * */
public class exam8 {

	// 내 풀이
	public long solution(long n) {
		long answer = -1;
        
        for(long i=1; i<=n/2; i++){
            if(i * i == n){
                answer = (i + 1) * (i + 1);
                break;
            }
        }
        
        if(n == 1)
            answer = 4;
        
        return answer;
    }
	
	// 남의 풀이
	/* public long solution(long n) {
		if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
	} */
	
	// 남의 풀이
	/* public long solution(long n) {
		double i = Math.sqrt(n);

    	return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
	} */
	
}
