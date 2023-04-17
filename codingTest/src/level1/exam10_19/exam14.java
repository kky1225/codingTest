package level1.exam10_19;

/*
 * 문제 이름 : 콜라츠 추측
 * 문제 설명 : 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다. 
 * 			예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
 * 입출력 예 : 16 → 8 → 4 → 2 → 1 이 되어 총 4번 만에 1이 됩니다.
 * 입출력 예 : 626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12943
 * 
 * */
public class exam14 {

	// 내 풀이
	public int solution(int num) {
        int answer = 0;
        long lNum = num;
        
        if(lNum > 1) {
        	for(int i=0; i<500; i++) {
            	if(lNum % 2 == 0) 
            		lNum /= 2;
            	else 
            		lNum = lNum * 3 + 1;
            	
            	answer++;
            	
            	if(lNum == 1)
            		break;
            }
        	
        	if(lNum != 1)
        		answer = -1;
        	
        }else {
        	answer = 0;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int num) {
        long n = (long)num;
    	for(int i=0; i<500; i++){
        	if(n==1) return i; 
      		n = (n%2==0) ? n/2 : n*3+1;
    	}

        return -1;
    } */
	
}
