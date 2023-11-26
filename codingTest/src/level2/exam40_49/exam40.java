package level2.exam40_49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 문제 이름 : 주차 요금 계산
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/92341
 * */
public class exam40 {

	// 내 풀이
	public int[] solution(int[] fees, String[] records) {
        Map<String, String> parking = new HashMap<>();
        Map<String, Integer> cal = new HashMap<>();

        for(String record : records) {
            String[] info = record.split(" ");

            if(info[2].equals("IN")) {
                if(!cal.containsKey(info[1])) {
                    cal.put(info[1], 0);
                }

                parking.put(info[1], info[0]);
            }else {
                cal.put(info[1], cal.get(info[1]) + totalTime(parking.get(info[1]), info[0]));

                parking.remove(info[1]);
            }
        }

        if(!parking.isEmpty()) {
            for(String key : parking.keySet()) {
                cal.put(key, cal.get(key) + totalTime(parking.get(key), "23:59"));
            }
        }

        List<String> keyNames = new ArrayList<>(cal.keySet());
        keyNames.sort(String::compareTo);

        List<Integer> answer = new ArrayList<>();

        for(String keyName : keyNames) {
            answer.add(calculate(cal.get(keyName), fees));
        }

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }

    public int totalTime(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        return (Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1])) - (Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]));
    }
    
    public int calculate(Integer totalTime, int[] fees) {
        if(totalTime > fees[0]) {
            if((totalTime - fees[0]) % fees[2] > 0) {
                return fees[1] + ((totalTime - fees[0]) / fees[2]) * fees[3] + fees[3];
            }
            
            return fees[1] + ((totalTime - fees[0]) / fees[2]) * fees[3];
        }

        return fees[1];
    }
		
	
	// 남의 풀이
	/* public int[] solution(int[] fees, String[] records) {
        return Arrays.stream(records)
                .map(s1 -> {
                    String[] splitted = s1.split(" ");
                    return new Triple(getMinute(splitted[0]), splitted[1], splitted[2].equals("IN") ? Status.In : Status.Out);
                })
                .collect(Collectors.groupingBy(triple -> triple.second))
                .entrySet()
                .stream()
                .map(stringListEntry -> {
                    Stack<Triple> stack = new Stack<>();
                    int time = 0;
                    int total = 0;

                    for (Triple v : stringListEntry.getValue()) {
                        switch (v.third) {
                            case In:
                                time += v.first;
                                stack.push(v);
                                break;
                            case Out:
                                time = v.first - time;
                                total += time;
                                time = 0;

                                stack.pop();
                                break;
                        }
                    }
                    if (!stack.isEmpty()) {
                        total += getMinute("23:59") - stack.peek().first;
                        stack.pop();
                    }
                    return new Pair(stringListEntry.getKey(), total < fees[0] ? fees[1] : (int) (fees[1] + Math.ceil(((double) total - fees[0]) / fees[2]) * fees[3]));
                })
                .sorted(Comparator.comparing(o -> o.first))
                .mapToInt(pair -> pair.second)
                .toArray();
    }

    private int getMinute(String strDate) {
        String[] separatedTime = strDate.split(":");
        int hour = Integer.parseInt(separatedTime[0]);
        int minute = Integer.parseInt(separatedTime[1]);
        return hour * 60 + minute;
    }

    static class Pair {
        String first;

        int second;

        Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Triple {
        int first;

        String second;

        Status third;

        Triple(int first, String second, Status third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    enum Status {
        In, Out
    } */

}
