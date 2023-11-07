package level2.exam30_39;

/*
 * 문제 이름 : k진수에서 소수 개수 구하기
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/92335
 * */
public class exam34 {

	// 내 풀이
	public int solution(int n, int k) {
        String changeNum = Integer.toString(n, k);
        
        String[] arrNum = changeNum.split("0");
        
        int answer = 0;
        
        for(String s : arrNum) {
            if(!s.isEmpty()) {
                long num = Long.parseLong(s);
                int sqrtNum = (int) Math.sqrt(num);
                
                if(num < 2) {
                    continue;
                }
                
                boolean check = true;
                
                for(int i=2;i<=sqrtNum;i++) {
                    if(num % i == 0) {
                        check = false;
                    }
                }
                
                if(check) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
		
	
	// 남의 풀이
	/* public int solution(int n, int k) {
        int answer = 0;
        String[] split = Long.toUnsignedString(n, k)
                    .replaceAll("[0]+", "0")
                    .split("0");

        for (String str : split) {
            if (isPrime(Long.parseLong(str))) {
                System.out.println(str);
                answer++;
            }
        }
        return answer;
    }



    public boolean isPrime(long number) {
        if(number < 2) return false;
        if(number == 2) return true;
        for(int i = 2; i <= (int) Math.sqrt(number); i++) {
            if(number % i == 0)  return false;
        }
        return true;
    } */

}
