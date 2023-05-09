package level1.exam30_39;

/*
 * 문제 이름 : 시저 암호
 * 문제 설명 : 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * 입출력 예 : "AB", 1, "BC"
 * 입출력 예 : "z", 1, "a"
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * 
 * */
public class exam35 {

	// 내 풀이
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder(); 
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) == ' ') {
        		sb.append(' ');
        	}else {
        		int sum = s.charAt(i) + n;
            	
            	if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
            		if(sum > 90) 
                        sb.append((char) (s.charAt(i) + n + 'A' - 'Z' - 1));
            		else 
                        sb.append((char) (s.charAt(i) + n));
            	}else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
            		if(sum > 122) 
                        sb.append((char) (s.charAt(i) + n + 'a' - 'z' - 1));
            		else 
                        sb.append((char) (s.charAt(i) + n));
            	}
        	}
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String s, int n) {
	    String answer = "";
        for(char ch : s.toCharArray()) {
            if(ch==' ') {
                answer += ch;
            }else if(ch>='a'&& ch<='z'){
                answer += (char)('a' + (ch+n-'a')%26);
            }else {
                answer += (char)('A' + (ch+n-'A')%26);
            }
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String s, int n) {
	    char[] split = s.toCharArray();
        for (int i = 0; i < split.length; i++) {
            if (split[i] >= 'A'  && split[i] <=  'Z') {
                split[i] += n % 26;
                if(!(split[i] >= 'A'  && split[i] <= 'Z')){
                    split[i] -= 26;
                }
            }else if(split[i] >= 'a'  && split[i] <= 'z'){
                split[i] += n % 26;
                if(!(split[i] >= 'a'  && split[i] <= 'z')){
                    split[i] -= 26;
                }
            }
        }
        return new StringBuffer().append(split).toString();
	} */
	
}
