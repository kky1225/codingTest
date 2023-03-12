package level0.exam40_49;

/*
 * 문제 이름 : 대문자와 소문자
 * 문제 설명 : 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
 * 입출력 예 : 소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120893
 * 
 * */
public class exam44 {

	// 내 풀이
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
		
		for(char c : my_string.toCharArray()) {
			if(Character.isLowerCase(c))
				answer.append(Character.toUpperCase(c));
			else
				answer.append(Character.toLowerCase(c));
		}
		
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string) {
		String answer = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                answer += (char)(s.charAt(i)-32);
            } else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                answer += (char)(s.charAt(i)+32);
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String my_string) {
		return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
	} */
	
}
