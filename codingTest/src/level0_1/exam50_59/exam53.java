package level0_1.exam50_59;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 5명씩
 * 문제 설명 : 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
 * 입출력 예 : 앞에서부터 5명씩 두 그룹으로 묶을 수 있습니다. ["nami", "ahri", "jayce", "garen", "ivern"], ["vex", "jinx"] 이 두 그룹에서 가장 앞에 서있는 사람들의 이름을 담은 리스트인 ["nami", "vex"]를 return합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181886
 * 
 * */
public class exam53 {

	// 내 풀이
	public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<names.length;i+=5) {
            list.add(names[i]);
        }
        
        return list.toArray(new String[list.size()]);
    }

	// 남의 풀이
	/* public String[] solution(String[] names) {
	    int idx = 0;
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        for (int i = 0;i < names.length;i+=5)
            answer[idx++] = names[i];
        return answer;
	} */
	
}
