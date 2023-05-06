package level1.exam30_39;

/*
 * 문제 이름 : 3진법 뒤집기
 * 문제 설명 : 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10진법 45, 3진법 1200, 앞뒤 반전(3진법) 0021, 10진법으로 표현 7
 * 입출력 예 : 10진법 125, 3진법 11122, 앞뒤 반전(3진법) 22211, 10진법으로 표현 229
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/68935
 * 
 * */
public class exam32 {

	// 내 풀이
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String s = new StringBuilder(sb).toString();
        
        return Integer.parseInt(s, 3);
    }
	
	// 남의 풀이
	/* public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    } */
	
	// 남의 풀이
	/* public int solution(int n) {
	    int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        while (n != 0) {
            int value = n % 3;
            queue.offer(value);
            n /= 3;
        }

        while (!queue.isEmpty()) {
            int pop = queue.poll();
            answer *= 3;
            answer += pop;
        }

        return answer;
	} */
	
}
