package level0.exam40_49;

/*
 * 문제 이름 : 제곱수 판별하기
 * 문제 설명 : 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
 * 입출력 예 : 976은 제곱수가 아닙니다. 따라서 2를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120909
 * 
 * */
public class exam40 {

	// 내 풀이
	public int solution(int n) {
		int answer = 0;
        
		for(int i=1; i<=n; i++){
            if(i*i == n){
                answer = 1;
                break;
            }
            
            if(i*i > n){
                answer = 2;
                break;
            }
        }
		
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
		if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
	} */
	
}
