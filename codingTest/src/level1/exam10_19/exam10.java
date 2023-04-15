package level1.exam10_19;

import java.util.Arrays;

/*
 * 문제 이름 : 정수 내림차순으로 배치하기
 * 문제 설명 : 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * 입출력 예 : 118372, [873211]
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * 
 * */
public class exam10 {

	// 내 풀이
	public long solution(long n) {
        StringBuilder answer = new StringBuilder();
        
        String strN = "" + n;
        long[] arrN = new long[strN.length()];
        
        for(int i=0; i<strN.length(); i++) 
        	arrN[i] = strN.charAt(i) - '0';
        
        Arrays.sort(arrN);
        
        for(int i=arrN.length-1;i>=0;i--)
        	answer.append(arrN[i]);
        
        return Long.parseLong(answer.toString());
    }
	
	// 남의 풀이
	/* public long solution(long n) {
		String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
	} */
	
	// 남의 풀이
	/* public long solution(long n) {
		return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
	} */
	
}
