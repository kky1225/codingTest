package level2.exam30_39;

/*
 * 문제 이름 : [3차] n진수 게임
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17687
 * */
public class exam36 {

	// 내 풀이
	public String solution(int n, int t, int m, int p) {
        String s = convert(n, t, m);

        StringBuilder answer = new StringBuilder();

        for(int i=0;i<t*m;i++) {
            if(i % m == 0) {
                answer.append(s.charAt(i + p - 1));
            }
        }

        return answer.toString();
    }
        
    public String convert(int n, int t, int m) {
        StringBuilder sb = new StringBuilder("0");

        for(int i=1;i<=t*m;i++) {
            sb.append(Integer.toString(i, n).toUpperCase());
        }

        return sb.toString();
    }
		
	
	// 남의 풀이
	/* public String solution(int n, int t, int m, int p) {
    String answer = "";

    int startNum = 0;

    String targetString = new String();
    String retString = new String();

    while (targetString.length() < m * t) {
        targetString += Integer.toString(startNum++, n);
    }

    for (int i=0; i<t; i++) {
        retString += targetString.charAt(p - 1 + i * m);
    }

      answer = retString.toUpperCase();


      return answer;
  } */

}
