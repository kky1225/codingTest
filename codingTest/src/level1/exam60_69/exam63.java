package level1.exam60_69;

import java.util.Arrays;

/*
 * 문제 이름 : 완주하지 못한 선수
 * 문제 설명 : 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
			마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * 입출력 예 : ["aya", "yee", "u", "maa"]에서 발음할 수 있는 것은 "aya"뿐입니다. 따라서 1을 return합니다.
 * 입출력 예 : ["ayaye", "uuuma", "yeye", "yemawoo", "ayaayaa"]에서 발음할 수 있는 것은 "aya" + "ye" = "ayaye", "ye" + "ma" + "woo" = "yemawoo"로 2개입니다. "yeye"는 같은 발음이 연속되므로 발음할 수 없습니다. 따라서 2를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * 
 * */
public class exam63 {

	// 내 풀이
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int index = participant.length-1;
        
        for(int i=0;i<participant.length-1;i++) {
            if(!participant[i].equals(completion[i])) {
                index = i;
                break;
            }
        }
        
        return participant[index];
    }
	
	// 남의 풀이
	/* public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public String solution(String[] participant, String[] completion) {
	     Map<String, Long> participantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String name : completion) {

            Long value = participantMap.get(name) - 1L;

            if(value == 0L) {
                participantMap.remove(name);
            } else {
                participantMap.put(name, value);
            }
        }

        return participantMap.keySet().iterator().next();
	} */
	
}
