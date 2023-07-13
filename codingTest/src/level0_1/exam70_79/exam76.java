package level0_1.exam70_79;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 문제 이름 : 문자열 잘라서 정렬하기
 * 문제 설명 : 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요. 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181866
 * 
 * */
public class exam76 {

	// 내 풀이
	public String[] solution(String myString) {
        List<String> list = Arrays.asList(myString.split("x", 0)).stream().filter(x -> !x.equals("")).sorted().collect(Collectors.toList());
         
        return list.toArray(new String[list.size()]);
    }
	
	// 남의 풀이
	/* public String[] solution(String myString) {
	    StringTokenizer st = new StringTokenizer(myString, "x");
        int idx = 0, N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[idx++] = st.nextToken();
        Arrays.sort(result);
        return result;
	} */
	
	// 남의 풀이
	/* public String[] solution(String myString) {
	    return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
	} */
	
}
