package level0.exam50_59;

/*
 * 문제 이름 : 369게임
 * 문제 설명 : 머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 3은 3이 1개 있으므로 1을 출력합니다.
 * 입출력 예 : 29423은 3이 1개, 9가 1개 있으므로 2를 출력합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120891
 * 
 * */
public class exam55 {

	// 내 풀이
	public int solution(int order) {
		int answer = 0;
		String strOrder = String.valueOf(order);
		
		for(char c : strOrder.toCharArray()) 
			if(String.valueOf(c).equals("3") || String.valueOf(c).equals("6") || String.valueOf(c).equals("9"))
				answer++;
		
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int order) {
	    int answer = 0;

        while (order >= 1) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer ++;
            order /= 10;
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int order) {
	    return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
	} */
	
}
