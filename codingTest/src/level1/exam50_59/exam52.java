package level1.exam50_59;

/*
 * 문제 이름 : 소수 찾기
 * 문제 설명 : 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요. 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
 * 입출력 예 : 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
 * 입출력 예 : 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12921
 * 
 * */
public class exam52 {

	// 내 풀이
	public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for(int i=2;i<=n;i++) {
            arr[i] = i;
        }
        
        for(int i=2;i<=n;i++) {
            if(arr[i] == 0) {
                continue;
            }
            
            for(int j=i*2;j<=n;j+=i) {
                arr[j]=0;
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                answer += 1;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
        int answer = 0;
      	for(int i = 2; i <= n; i++){
          int j = 2;
          int cnt = 0;
          while(j <= (int)Math.sqrt(i)){
              if(i % j == 0){
                cnt += 1;
                break;
              } 
              j += 1;
          }
          if(cnt == 0) answer += 1;
      }
      return answer;
    } */
	
}
