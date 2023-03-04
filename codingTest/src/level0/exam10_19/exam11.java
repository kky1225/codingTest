package level0.exam10_19;

/*
 * 문제 이름 : 양꼬치
 * 문제 설명 : 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 10인분을 시켜 서비스로 음료수를 하나 받아 총 10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원입니다.
 * 입출력 예 : 64인분을 시켜 서비스로 음료수를 6개 받아 총 64 * 12000 + 6 * 2000 - 6 * 2000 =768,000원입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120830
 * 
 * */
public class exam11 {

	// 내 풀이
	public int solution(int n, int k) {
		int answer = 0;
        int service = n / 10;
        
        answer = n * 12000 + (k-service) * 2000;
        
        return answer;
    }
	
	// 남의 풀이
	
	
}
