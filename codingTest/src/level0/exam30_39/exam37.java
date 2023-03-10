package level0.exam30_39;

/*
 * 문제 이름 : 모음 제거
 * 문제 설명 : 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "bus"에서 모음 u를 제거한 "bs"를 return합니다.
 * 입출력 예 : "nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120849
 * 
 * */
public class exam37 {

	// 내 풀이
	public String solution(String my_string) {
		StringBuilder answer = new StringBuilder();
        
		for(char c : my_string.toCharArray()) 
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') 
				answer.append(c);
		
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string) {
		String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String my_string) {
		String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        for(String vowel : vowels){
            if(my_string.contains(vowel)){
                my_string = my_string.replace(vowel, "");
            }
        }
        return my_string;
	} */
	
}
