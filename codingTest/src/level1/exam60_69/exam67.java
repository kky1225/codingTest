package level1.exam60_69;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 문제 이름 : 대충 만든 자판
 * 문제 설명 : 휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있습니다. 키 하나에 여러 문자가 할당된 경우, 동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀝니다.
			예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면 1번 키를 한 번 누르면 "A", 두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다. 
			같은 규칙을 적용해 아무렇게나 만든 휴대폰 자판이 있습니다. 이 휴대폰 자판은 키의 개수가 1개부터 최대 100개까지 있을 수 있으며, 특정 키를 눌렀을 때 입력되는 문자들도 무작위로 배열되어 있습니다. 
			또, 같은 문자가 자판 전체에 여러 번 할당된 경우도 있고, 키 하나에 같은 문자가 여러 번 할당된 경우도 있습니다. 심지어 아예 할당되지 않은 경우도 있습니다. 따라서 몇몇 문자열은 작성할 수 없을 수도 있습니다.
			이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 합니다.
			1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때, 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.
			단, 목표 문자열을 작성할 수 없을 때는 -1을 저장합니다.
			keymap		targets		result
 * 입출력 예 : ["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
 * 입출력 예 : ["AA"]	["B"]	[-1]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/160586
 * 
 * */
public class exam67 {

	// 내 풀이
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
        	int count = 0;
        	
        	for(int j= 0; j < targets[i].length(); j++) {
        		List<Integer> keyList = new ArrayList<>();
        		
        		for(int k=0;k<keymap.length;k++) {
            		if(keymap[k].contains(String.valueOf(targets[i].charAt(j)))) {
            			keyList.add(keymap[k].indexOf(String.valueOf(targets[i].charAt(j))) + 1);
            		}
            	}
        		
        		if(keyList.isEmpty()) {
        			count = -1;
        			break;
            	}else{
            		count += Collections.min(keyList);
            	}
        	}
        	
        	answer[i] += count;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String[] keymap, String[] targets) {
        int[] minTouch = new int['Z' - 'A' + 1];
        Arrays.fill(minTouch, 200);
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                minTouch[key.charAt(i) - 'A'] = Math.min(minTouch[key.charAt(i) - 'A'], i + 1);
            }
        }
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int sum = 0;
            boolean canMake = true;
            for (int j = 0; j < target.length(); j++) {
                if (minTouch[target.charAt(j) - 'A'] == 200) {
                    canMake = false;
                    break;
                }
                sum += minTouch[target.charAt(j) - 'A'];
            }
            answer[i] = canMake ? sum : -1;
        }
        return answer;
    } */

	// 남의 풀이
    /* public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Set<String> set = new HashSet<>(Arrays.asList(keymap));
        set.remove("");

        for (int i = 0; i < targets.length; i++) { // targets

            for (int l = 0; l < targets[i].length(); l++) { // char
                int k = 101;

                for (String j : set) { // set
                    int index = j.indexOf(targets[i].charAt(l));

                    if (index == -1) continue;
                    else if (index < k) k = index;
                }


                if (k == 101) {
                    answer[i] = -1;
                    break;
                } else answer[i] += (k + 1);
            }
        }

        return answer;
    } */
	
}
