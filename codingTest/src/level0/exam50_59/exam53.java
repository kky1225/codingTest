package level0.exam50_59;

/*
 * 문제 이름 : 외계행성의 나이
 * 문제 설명 : 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : age가 23이므로 "cd"를 return합니다.
 * 입출력 예 : age가 51이므로 "fb"를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120834
 * 
 * */
public class exam53 {

	// 내 풀이
	public String solution(int age) {
		StringBuilder answer = new StringBuilder();
		String strAge = String.valueOf(age);
		
		for(char c : strAge.toCharArray()) {
			switch (c) {
				case '0' : {
					answer.append("a");
					break;
				}
				case '1' : {
					answer.append("b");
					break;
				}
				case '2' : {
					answer.append("c");
					break;
				}
				case '3' : {
					answer.append("d");
					break;
				}
				case '4' : {
					answer.append("e");
					break;
				}
				case '5' : {
					answer.append("f");
					break;
				}
				case '6' : {
					answer.append("g");
					break;
				}
				case '7' : {
					answer.append("h");
					break;
				}
				case '8' : {
					answer.append("i");
					break;
				}
				case '9' : {
					answer.append("j");
					break;
				}
			}
		}
		
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(int age) {
	    String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(int age) {
	    return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
	} */
	
}
