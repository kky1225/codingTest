package level1.exam20_29;

/*
 * 문제 이름 : 문자열 다루기 기본
 * 문제 설명 : 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 * 입출력 예 : 
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * 
 * */
public class exam27 {

	// 내 풀이
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6)
            answer = false;
        
        for(char c : s.toCharArray())
            if(!Character.isDigit(c))
                answer = false;
        
        return answer;
    }
	
	// 남의 풀이
	/* public boolean solution(String s) {
	    if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      	}
      	else return false;
	} */
	
	// 남의 풀이
	/* public boolean solution(String s) {
	    if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
	} */
	
}
