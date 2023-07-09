package level0_1.exam50_59;

/*
 * 문제 이름 : 0 떼기
 * 문제 설명 : 정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "0010"의 가장 왼쪽에 연속으로 등장하는 "0"을 모두 제거하면 "10"이 됩니다.
 * 입출력 예 : "854020"는 가장 왼쪽에 0이 없으므로 "854020"을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181847
 * 
 * */
public class exam57 {

	// 내 풀이
	public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        boolean zeroCheck = false;
        
        for(char n_char : n_str.toCharArray()) {
            if(n_char != '0') {
                zeroCheck = true;
            }
            
            if(zeroCheck) {
                sb.append(n_char);
            }
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String n_str) {
	    return ""+Integer.parseInt(n_str);
	} */
	
}
