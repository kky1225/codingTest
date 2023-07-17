package level0_1.exam90_99;

/*
 * 문제 이름 : 문자열이 몇 번 등장하는지 세기
 * 문제 설명 : 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181871
 * 
 * */
public class exam90 {

	// 내 풀이
	public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i=0;i<myString.length() - pat.length() + 1;i++) {
            if(myString.substring(i, pat.length() + i).equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String myString, String pat) {
	    return (int) Stream.iterate(0, i -> i + 1)
            .limit(myString.length() - pat.length() + 1)
            .filter(i -> myString.substring(i, i + pat.length()).equals(pat))
            .count();
	} */
	
}
