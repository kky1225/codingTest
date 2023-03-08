package level0.exam20_29;

/*
 * 문제 이름 : 아이스 아메리카노
 * 문제 설명 : 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
 * 입출력 예 : 15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120819
 * 
 * */
public class exam26 {

	// 내 풀이
	public int[] solution(int money) {
		int[] answer = new int[2];
		
		answer[0] = money / 5500;
        answer[1] = money % 5500;
		
        return answer;
    }
	
	// 남의 풀이
	
}
