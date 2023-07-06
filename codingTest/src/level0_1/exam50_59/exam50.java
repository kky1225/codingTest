package level0_1.exam50_59;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 공백으로 구분하기 2
 * 문제 설명 : 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 my_string은 " i    love  you"로 공백을 기준으로 단어를 나누면 "i", "love", "you" 3개의 단어가 있습니다. 따라서 ["i", "love", "you"]를 return 합니다.
 * 입출력 예 : 예제 2번의 my_string은 "    programmers  "로 단어는 "programmers" 하나만 있습니다. 따라서 ["programmers"]를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181868
 * 
 * */
public class exam50 {

	// 내 풀이
	public String[] solution(String my_string) {
        String[] strArr = my_string.trim().split(" ");
        
        List<String> list = new ArrayList<>();
        
        for(String str : strArr) {
            if(!str.equals("")) {
                list.add(str);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
	
	// 남의 풀이
	/* public String[] solution(String my_string) {
        return my_string.trim().split("[ ]+");
    } */
	
	// 남의 풀이
	/* public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[n] = st.nextToken();
        return result;
    } */

}
