package level1.exam70_79;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 문제 이름 : 신고 결과 받기
 * 문제 설명 : 신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.
 			각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다. 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다. 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
 			k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다. 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
 			다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.
 			
 			유저 ID		유저가 신고한 ID		설명
 			"muzi"		"frodo"		"muzi"가 "frodo"를 신고했습니다.
 			"apeach"	"frodo"		"apeach"가 "frodo"를 신고했습니다.
 			"frodo"		"neo"		"frodo"가 "neo"를 신고했습니다.
 			"muzi"		"neo"		"muzi"가 "neo"를 신고했습니다.
 			"apeach"	"muzi"		"apeach"가 "muzi"를 신고했습니다.
 			
 			각 유저별로 신고당한 횟수는 다음과 같습니다.
 			
 			유저 ID	신고당한 횟수
			"muzi"		1
			"frodo"		2
			"apeach"	0
			"neo"		2

			위 예시에서는 2번 이상 신고당한 "frodo"와 "neo"의 게시판 이용이 정지됩니다. 이때, 각 유저별로 신고한 아이디와 정지된 아이디를 정리하면 다음과 같습니다.

			유저 ID		유저가 신고한 ID		정지된 ID
			"muzi"		["frodo", "neo"]		["frodo", "neo"]
			"frodo"		["neo"]					["neo"]
			"apeach"	["muzi", "frodo"]		["frodo"]
			"neo"		없음						없음.
			
			따라서 "muzi"는 처리 결과 메일을 2회, "frodo"와 "apeach"는 각각 처리 결과 메일을 1회 받게 됩니다.
			이용자의 ID가 담긴 문자열 배열 id_list, 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report, 정지 기준이 되는 신고 횟수 k가 매개변수로 주어질 때, 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return 하도록 solution 함수를 완성해주세요.

			id_list		report		k		result
 * 입출력 예 : ["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
 * 입출력 예 : ["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/92334
 * 
 * */
public class exam76 {

	// 내 풀이
	public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String id : id_list) {
            map.put(id, 0);
        }
        
        Set<String> set = new HashSet<>();
        
        for(String reportStr : report) {
            set.add(reportStr);
        }
        
        for(String s : set) {
            String[] sArr = s.split(" ");
            
            map.replace(sArr[1], map.get(sArr[1]) + 1);
        }
        
        List<String> list = new ArrayList<>();
        
        for(String s : set) {
            String[] sArr = s.split(" ");
            
            if(map.get(sArr[1]) >= k) {
                list.add(sArr[0]);
            }
        }
        
        int[] answer = new int[id_list.length];
        
        for(String s : list) {
            for(int i=0;i<id_list.length;i++) {
                if(s.equals(id_list[i])) {
                    answer[i] += 1;
                }
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String[] park, String[] routes) {
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(String[] park, String[] routes) {
		Map<String, Set<String>> map = new HashMap<>();

        for (String rep : report) {
            String[] arr = rep.split(" ");
            Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
            set.add(arr[0]);
            map.put(arr[1], set);
        }

        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String id : id_list) {
            countMap.put(id, 0);
        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= k) { // 정지당할놈
                for (String value : entry.getValue()) {
                    countMap.put(value, countMap.getOrDefault(value, 0) + 1);
                }
            }
        }

        return countMap.values().stream().mapToInt(Integer::intValue).toArray();
	} */
	
}
