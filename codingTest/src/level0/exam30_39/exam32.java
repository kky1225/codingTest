package level0.exam30_39;

/*
 * 문제 이름 : 문자 반복 출력하기
 * 문제 설명 : 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : "hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120825
 * 
 * */
public class exam32 {

	// 내 풀이
	public StringBuilder solution(String my_string, int n) {
		StringBuilder answer = new StringBuilder();
        
		for(char c : my_string.toCharArray())
            for(int i=0; i<n; i++)
			    answer.append(c);
        
        return answer;
    }
	
	// 남의 풀이
	/* public StringBuilder solution(String my_string, int n) {
		StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
	} */
	
}
