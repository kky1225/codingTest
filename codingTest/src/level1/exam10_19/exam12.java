package level1.exam10_19;

/*
 * 문제 이름 : 하샤드 수
 * 문제 설명 : 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * 입출력 예 : 10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
 * 입출력 예 : 12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12947
 * 
 * */
public class exam12 {

	// 내 풀이
	public boolean solution(int x) {
        boolean answer = true;
        int origin_x = x;
        int sum = 0;
        
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        if(origin_x % sum != 0)
            answer = false;
        
        return answer;
    }
	
	// 남의 풀이
	/* public boolean solution(int x) {
		String [] tmp = String.valueOf(num).split("");
    	int sum=0;
    	
        for(String s:tmp) {
            sum+=Integer.parseInt(s);
        }

        if(num%sum==0) {
            return true;
        } else {
            return false;
        }
	} */
	
	// 남의 풀이
	/* public boolean solution(int x) {
		int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
	} */
	
}
