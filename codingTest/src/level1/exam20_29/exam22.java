package level1.exam20_29;

/*
 * 문제 이름 : 수박수박수박수박수박수?
 * 문제 설명 : 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 * 입출력 예 : 3 : "수박수"
 * 입출력 예 : 4 : "수박수박"
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12922
 * 
 * */
public class exam22 {

	// 내 풀이
	public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=n; i++){
            if(i % 2 == 0)
                sb.append("박");
            else
                sb.append("수");
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(int n) {
	    return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	} */
	
	// 남의 풀이
	/* public String solution(int n) {
	    String result = "";

 		for(int i=0;i<n;i++) {
   			result +=(i%2==0)? "수":"박";
 		}

        return result;
	} */
	
}
