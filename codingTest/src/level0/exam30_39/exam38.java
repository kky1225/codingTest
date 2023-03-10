package level0.exam30_39;

/*
 * 문제 이름 : 문자열안에 문자열
 * 문제 설명 : 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "ab6CDE443fgh22iJKlmn1o" str1에 str2가 존재하므로 1을 return합니다.
 * 입출력 예 : "ppprrrogrammers" str1에 str2가 없으므로 2를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120908
 * 
 * */
public class exam38 {

	// 내 풀이
	public int solution(String str1, String str2) {
		int answer = 0;
        
		if(str1.contains(str2))
			answer = 1;
		else
			answer = 2;
		
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String str1, String str2) {
		int answer = 0;
        if(str1.indexOf(str2) != -1){
            answer = 1;
        }
        else answer =2;
        return answer;
	} */
	
}
