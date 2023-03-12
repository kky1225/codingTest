package level0.exam50_59;

/*
 * 문제 이름 : 인덱스 바꾸기
 * 문제 설명 : 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : "hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.
 * 입출력 예 : "I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120895
 * 
 * */
public class exam50 {

	// 내 풀이
	public String solution(String my_string, int num1, int num2) {
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<my_string.length(); i++){
			if(i == num1)
				answer.append(my_string.charAt(num2));
			else if(i == num2)
				answer.append(my_string.charAt(num1));
			else
				answer.append(my_string.charAt(i));
        }
		
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    } */
	
	// 남의 풀이
	/* public String solution(String my_string, int num1, int num2) {
	    char temp = my_string.charAt(num1);
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, temp);
        return String.valueOf(sb);
	} */
	
}
