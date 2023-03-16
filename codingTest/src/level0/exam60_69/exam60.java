package level0.exam60_69;

/*
 * 문제 이름 : 중복된 문자 제거
 * 문제 설명 : 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 return합니다.
 * 입출력 예 : "We are the world"에서 중복된 문자 "e", " ", "r" 들을 제거한 "We arthwold"을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120888
 * 
 * */
public class exam60 {

	// 내 풀이
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
		int strIndex = 0;
		
		for(char c : my_string.toCharArray()) {
			String strC = String.valueOf(c);
			strIndex = answer.indexOf(strC);
			if(strIndex == -1)
				answer.append(strC);
		}
		
        return answer.toString();
	}
	
	// 남의 풀이
	/* public String solution(String my_string) {
	    String answer = "";

        for(int i=0; i<my_string.length(); i++){
            //my_string.indexOf(my_string.charAt(i));
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String my_string) {
	    return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
	} */
	
}
