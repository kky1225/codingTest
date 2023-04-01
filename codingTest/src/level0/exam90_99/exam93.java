package level0.exam90_99;

/*
 * 문제 이름 : OX퀴즈
 * 문제 설명 : 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 3 - 4 = -3 은 틀린 수식이므로 "X", 5 + 6 = 11 은 옳은 수식이므로 "O" 입니다. 따라서 ["X", "O"]를 return합니다.
 * 입출력 예 : 19 - 6 = 13 은 옳은 수식이므로 "O", 5 + 66 = 71 은 옳은 수식이므로 "O", 5 - 15 = 63 은 틀린 수식이므로 "X", 3 - 1 = 2는 옳은 수식이므로 "O" 따라서 ["O", "O", "X", "O"]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 * 
 * */
public class exam93 {

	// 내 풀이
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		int index = 0;
		
		for(String s : quiz) {
			String[] cal = s.split(" ");
			int result = 0;
			
			switch (cal[1]) {
				case "+" : {
					result = Integer.parseInt(cal[0]) + Integer.parseInt(cal[2]);
					break;
				}case "-" : {
					result = Integer.parseInt(cal[0]) - Integer.parseInt(cal[2]);
					break;
				}
			}
			
			if(result == Integer.parseInt(cal[4])) answer[index] = "O";
			else answer[index] = "X";
			
			index++;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public String[] solution(String[] quiz) {
	 	for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    } */
	
	// 남의 풀이
	/* public String[] solution(String[] quiz) {
	 	return Arrays.stream(quiz).map(s -> {
            String[] arr = s.trim().split(" ");
            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
        }).toArray(String[]::new);
	} */
	
}
