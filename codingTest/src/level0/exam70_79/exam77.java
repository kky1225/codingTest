package level0.exam70_79;

/*
 * 문제 이름 : 문자열 계산하기
 * 문제 설명 : my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 * 입출력 예 : 3 + 4 = 7을 return 합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120902
 * 
 * */
public class exam77 {

	// 내 풀이
	public int solution(String my_string) {
		String[] arrMy_string = my_string.split(" ");
		int answer = Integer.parseInt(arrMy_string[0]);
		
		for(int i=0; i<arrMy_string.length; i++) {
			if(arrMy_string[i].equals("+")) {
				answer += Integer.parseInt(arrMy_string[i + 1]);
			}else if(arrMy_string[i].equals("-")){
				answer -= Integer.parseInt(arrMy_string[i + 1]);
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(String my_string) {
	    String[] strs = my_string.split(" ");

        Stack<Integer> stack = new Stack<>();

        String operator = "";
        for (String str : strs) {
            if (str.equals("+") || str.equals("-")) operator = str;
            else if(isNumeric(str)) stack.push(Integer.parseInt(str));

            if (stack.size() == 2) {
                int a = stack.pop();
                int b = stack.pop();

                if (operator.equals("+")) stack.push(b + a);
                else stack.push(b - a);
            }
        }

        return stack.pop();
	} */
	
	// 남의 풀이
	/* public int solution(String my_string) {
	    return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
	} */
}
