package level0.exam70_79;

/*
 * 문제 이름 : 컨트롤 제트
 * 문제 설명 : 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 10 + 20 + 30 + 40 = 100을 return 합니다.
 * 입출력 예 : "10 Z 20 Z 1"에서 10 다음 Z, 20 다음 Z로 10, 20이 지워지고 1만 더하여 1을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120853
 * 
 * */
public class exam74 {

	// 내 풀이
	public int solution(String s) {
		String[] arrS = new String[s.length()];
		arrS = s.split(" ");
		
		int answer = 0;
		
		for(int i=0; i<arrS.length; i++) {
			if(arrS[i].equals("Z")) 
				answer -= Integer.parseInt(arrS[i - 1]);
			else 
				answer += Integer.parseInt(arrS[i]);
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(String s) {
	    int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
	} */
	
}
