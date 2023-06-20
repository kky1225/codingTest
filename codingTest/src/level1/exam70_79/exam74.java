package level1.exam70_79;

import java.util.HashMap;
import java.util.Map;

/*
 * 문제 이름 : 달리기 경주
 * 문제 설명 : 얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다. 
 			선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요. 
 			
			players		callings		result
 * 입출력 예 : ["mumu", "soe", "poe", "kai", "mine"]	["kai", "kai", "mine", "mine"]	["mumu", "kai", "mine", "soe", "poe"]
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/178871
 * 
 * */
public class exam74 {

	// 내 풀이
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<players.length;i++) {
			map.put(players[i], i);
		}
		
        for(String calling : callings) {
        	String frontPlayer = players[map.get(calling) - 1];
        	players[map.get(calling) - 1] = players[map.get(calling)];
        	players[map.get(calling)] = frontPlayer;
        	
        	map.replace(frontPlayer, map.get(frontPlayer) + 1);
        	map.replace(calling, map.get(calling) - 1);
        }
        
        String[] answer = players.clone();
        
        return answer;
    }
	
	// 남의 풀이
	/* public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> current = IntStream.range(0, players.length)
                .boxed()
                .collect(Collectors.toMap(i -> players[i], Function.identity()));
        List<String> currentPlayers = Arrays.stream(players).collect(Collectors.toList());

        for (String calling : callings) {
            swap(currentPlayers, current, calling);
        }

        return currentPlayers.toArray(String[]::new);
    }

    private void swap(List<String> currentPlayers, Map<String, Integer> current, String calling) {
        int index = current.get(calling);
        String otherPlayer = currentPlayers.get(index - 1);
        Collections.swap(currentPlayers, index, index - 1);
        current.put(otherPlayer, index);
        current.put(calling, index - 1);
    } */
	
}
