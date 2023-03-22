package level0.exam70_79;

/*
 * 문제 이름 : 잘라서 배열로 저장하기
 * 문제 설명 : 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "abc1Addfggg4556b" 를 길이 6씩 잘라 배열에 저장한 ["abc1Ad", "dfggg4", "556b"]를 return해야 합니다.
 * 입출력 예 : "abcdef123" 를 길이 3씩 잘라 배열에 저장한 ["abc", "def", "123"]를 return해야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120913
 * 
 * */
public class exam76 {

	// 내 풀이
	public String[] solution(String my_str, int n) {
		String[] answer;
		int index = 0;
		
		if(my_str.length() % n > 0) {
			answer = new String[my_str.length() / n + 1];
		}else {
			answer = new String[my_str.length() / n];
		}
		
		answer[index] = "";
				
		for(int i=0; i<my_str.length(); i++) {
			answer[index] += String.valueOf(my_str.charAt(i));
			
			if((i + 1) % n == 0 && i < my_str.length() - 1) {
				index++;
				answer[index] = "";
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public String[] solution(String my_str, int n) {
	    int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public String[] solution(String my_str, int n) {
	    return IntStream.range(0, myStr.length() / n + (myStr.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == myStr.length() / n ? myStr.substring(i * n) : myStr.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
	} */
}
