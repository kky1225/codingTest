package level1.exam50_59;

/*
 * 문제 이름 : 기사단원의 무기
 * 문제 설명 : 숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
			각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.
			예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로, 공격력이 4인 무기를 구매합니다. 만약, 이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면, 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다. 무기를 만들 때, 
			무기의 공격력 1당 1kg의 철이 필요합니다. 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 무게를 미리 계산하려 합니다.
			기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
 * 입출력 예 : 1부터 5까지의 약수의 개수는 순서대로 [1, 2, 2, 3, 2]개입니다. 모두 공격력 제한 수치인 3을 넘지 않기 때문에 필요한 철의 무게는 해당 수들의 합인 10이 됩니다. 따라서 10을 return 합니다.
 * 입출력 예 : 1부터 10까지의 약수의 개수는 순서대로 [1, 2, 2, 3, 2, 4, 2, 4, 3, 4]개입니다. 공격력의 제한수치가 3이기 때문에, 6, 8, 10번 기사는 공격력이 2인 무기를 구매합니다. 따라서 해당 수들의 합인 21을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/136798
 * 
 * */
public class exam58 {

	// 내 풀이
	public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int i=2;i<=number;i++) {
            int count = 1;
            int finalNumber = i / 2 + 1;
            
            for(int j=1;j<finalNumber;j++) {
                if(i % j == 0) {
                   count++;
                }
                
                if(count > limit) {
                    count = power;
                    break;
                }
            }
            answer += count;
            
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; ++i) {
            int count = 0;
            for(int j = 1; j*j <= i; ++j) {
                if(j*j == i) count++;
                else if(i%j == 0) count += 2;
            }
            if(count > limit) answer += power;
            else answer += count;
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(int number, int limit, int power) {
	    int answer = 0;
        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    cnt = i / j == j ? cnt + 1 : cnt + 2;
                }
            }
            answer = cnt > limit ? answer + power : answer + cnt;
        }
        return answer;
	} */
	
}