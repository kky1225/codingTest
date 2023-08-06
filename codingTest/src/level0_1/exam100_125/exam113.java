package level0_1.exam100_125;

/*
 * 문제 이름 : 문자열 여러 번 뒤집기
 * 문제 설명 : 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181913
 * 
 * */
public class exam113 {

	// 내 풀이
	public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i=0;i<queries.length;i++) {
            StringBuilder reverseStr = new StringBuilder();
            
            for(int j=queries[i][1];j>=queries[i][0];j--) {
                reverseStr.append(answer.charAt(j));
            }
            
            String startStr = answer.substring(0, queries[i][0]);
            String endStr = answer.substring(queries[i][1] + 1, answer.length());
            
            answer = startStr + reverseStr.toString() + endStr;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int[][] queries) {
	    for (int[] arr : queries) {
            myString = myString.substring(0, arr[0]) + new StringBuilder(myString.substring(arr[0], arr[1] + 1)).reverse().toString() + myString.substring(arr[1] + 1);
        }
        return myString;
	} */
	
}
