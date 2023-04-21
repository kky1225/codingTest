package level1.exam20_29;

/*
 * 문제 이름 : 가운데 글자 가져오기
 * 문제 설명 : 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 입출력 예 : "abcde" : "c"
 * 입출력 예 : "qwer" : "we"
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * */
public class exam21 {

	// 내 풀이
	public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        
        if(s.length() % 2 == 0){
            start = s.length() / 2;
            end = s.length() / 2 + 1;
        }else{
            start = s.length() / 2 + 1;
            end = s.length() / 2 + 1;
        }
        
        for(int i=start-1; i<end; i++)
            sb.append(s.charAt(i));
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String s) {
	    return s.substring((s.length()-1)/2, s.length()/2 + 1);
	} */
	
	// 남의 풀이
	/* public String solution(String s) {
	    int ans = s.length();
        if (ans % 2 == 1){
         return Character.toString(s.charAt(ans/2));   
        }
        else{
            return s.substring(ans/2-1, ans/2+1);
        }
	} */
	
}
