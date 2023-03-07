package level0.exam20_29;

/*
 * 문제 이름 : 옷가게 할인 받기
 * 문제 설명 : 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다. 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 150,000원에서 5%를 할인한 142,500원을 return 합니다.
 * 입출력 예 : 580,000원에서 20%를 할인한 464,000원을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120818
 * 
 * */
public class exam24 {

	// 내 풀이
	public int solution(int price) {
		int answer = 0;
        
		if(price >= 500000)
            answer = (int) (price * 0.8);
        else if(price >= 300000)
            answer = (int) (price * 0.9);
        else if(price >= 100000)
            answer = (int) (price * 0.95);
        else
        	answer = price;

        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int price) {
	    int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));
        answer = (int)(price*ratio);
        return answer;
	} */
	
}
