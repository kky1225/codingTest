package level0_1.exam60_69;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 문제 이름 : ad 제거하기
 * 문제 설명 : 문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181867
 * 
 * */
public class exam68 {

	// 내 풀이
	public String[] solution(String[] strArr) {
        List<String> list = Arrays.asList(strArr).stream().filter(s -> !s.contains("ad")).collect(Collectors.toList());
        
        return list.toArray(new String[list.size()]);
    }
	
	// 남의 풀이
	/* public String[] solution(String[] strArr) {
	    ArrayList<String> arrayList = new ArrayList<>();

        for (String str : strArr)
            if (!str.contains("ad"))
                arrayList.add(str);

        int idx = 0;
        String[] answer = new String[arrayList.size()];
        for (String str : arrayList)
            answer[idx++] = str;
        return answer;
	} */
	
}
