package level0.exam60_69;

import java.util.Arrays;

/*
 * 문제 이름 : 한 번만 등장한 문자
 * 문제 설명 : 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 * 입출력 예 : "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
 * 입출력 예 : "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120896
 * 
 * */
public class exam68 {

	// 내 풀이
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		char[] arrCh = s.toCharArray();
		int count = 0;
		
		Arrays.sort(arrCh);
		
		for(int i=0; i<arrCh.length; i++) {
			count = 0;
			
			for(int j=0; j<arrCh.length; j++) {
				if(arrCh[i] == arrCh[j]) {
					count++;
				}
			}
			
			if(count == 1) {
				answer.append(arrCh[i]);
			}
		}
		
        return answer.toString();
	}
	
	// 남의 풀이
	/* public String solution(String s) {
	    HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String replace = s.replace(s.charAt(i) + "", "");
            if(s.length() - replace.length() == 1){
                set.add(s.charAt(i)+"");
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return String.join("", list);
	} */
	
	// 남의 풀이
	/* public String solution(String s) {
	    return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
	} */
	
}
