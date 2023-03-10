package level0.exam30_39;

/*
 * 문제 이름 : 숨어있는 숫자의 덧셈 (1)
 * 문제 설명 : 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "aAb1B2cC34oOp"안의 한자리 자연수는 1, 2, 3, 4 입니다. 따라서 1 + 2 + 3 + 4 = 10 을 return합니다.
 * 입출력 예 : "1a2b3c4d123Z"안의 한자리 자연수는 1, 2, 3, 4, 1, 2, 3 입니다. 따라서 1 + 2 + 3 + 4 + 1 + 2 + 3 = 16 을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120851
 * 
 * */
public class exam36 {

	// 내 풀이
	public int solution(String my_string) {
		int answer = 0;
        
		for(char c : my_string.toCharArray())
            if(Character.isDigit(c)) 
            	answer += Integer.parseInt(String.valueOf(c));
            
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String my_string) {
		for(int i=0; i<s.length();i++){
            if(s.charAt(i)>48 && s.charAt(i)<58){
                answer += Integer.parseInt("" + s.charAt(i)) ;
            }
        }
	} */
	
	// 남의 풀이
	/* public int solution(String my_string) {
		return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
	} */
	
}
