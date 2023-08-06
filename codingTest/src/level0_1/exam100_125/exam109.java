package level0_1.exam100_125;

/*
 * 문제 이름 : 왼쪽 오른쪽
 * 문제 설명 : 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. 
			str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 리스트를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181890
 * 
 * */
public class exam109 {

	// 내 풀이
	public String[] solution(String[] str_list) {
        String[] answer = {};
        int index = 0;
        
        for(String str : str_list) {
            if(str.equals("l")) {
                answer = new String[index];
                
                for(int i=0;i<index;i++) {
                    answer[i] = str_list[i];
                }
                
                return answer;
            }else if(str.equals("r")) {
                answer = new String[str_list.length - index - 1];
                int answerIndex = 0;
                
                for(int i=index + 1;i<str_list.length;i++) {
                    answer[answerIndex++] = str_list[i];
                }
                
                return answer;
            }
            
            index++;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public String[] solution(String[] str_list) {
	    return IntStream.range(0, str_list.length)
                .boxed()
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .map(i -> {
                    if (str_list[i].equals("l")) {
                        return Arrays.copyOfRange(str_list, 0, i);
                    }
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                })
                .orElseGet(() -> new String[]{});
	} */
	
	// 남의 풀이
	/* public String[] solution(String[] str_list) {
	    for (int i = 0; i < str_list.length; i++) {

            if ("l".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if ("r".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[0];
	} */
	
}
