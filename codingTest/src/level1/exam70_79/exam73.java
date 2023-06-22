package level1.exam70_79;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 문제 이름 : 개인정보 수집 유효기간
 * 문제 설명 : 고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다. 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다. 당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기해야 합니다. 
 			예를 들어, A라는 약관의 유효기간이 12 달이고, 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다. 당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다. 
 			모든 달은 28일까지 있다고 가정합니다. 다음은 오늘 날짜가 2022.05.19일 때의 예시입니다.
			약관 종류	유효기간
			A	6 달
			B	12 달
			C	3 달
			
			번호		개인정보 수집 일자		약관 종류
			1		2021.05.02		A
			2		2021.07.01		B
			3		2022.02.19		C
			4		2022.02.20		C
			
			첫 번째 개인정보는 A약관에 의해 2021년 11월 1일까지 보관 가능하며, 유효기간이 지났으므로 파기해야 할 개인정보입니다.
			두 번째 개인정보는 B약관에 의해 2022년 6월 28일까지 보관 가능하며, 유효기간이 지나지 않았으므로 아직 보관 가능합니다.
			세 번째 개인정보는 C약관에 의해 2022년 5월 18일까지 보관 가능하며, 유효기간이 지났으므로 파기해야 할 개인정보입니다.
			네 번째 개인정보는 C약관에 의해 2022년 5월 19일까지 보관 가능하며, 유효기간이 지나지 않았으므로 아직 보관 가능합니다.
			따라서 파기해야 할 개인정보 번호는 [1, 3]입니다.
			오늘 날짜를 의미하는 문자열 today, 약관의 유효기간을 담은 1차원 문자열 배열 terms와 수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies가 매개변수로 주어집니다. 이때 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
			today			terms			privacies		result
 * 입출력 예 : "2022.05.19"		["A 6", "B 12", "C 3"]		["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]	[1, 3]
 * 입출력 예 : "2020.01.01"		["Z 3", "D 5"]		["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]	[1, 4, 5]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/150370
 * 
 * */
public class exam73 {

	// 내 풀이
	public int[] solution(String today, String[] terms, String[] privacies) {
		Map<String, Integer> termsMap = new HashMap<>();
		List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<terms.length;i++) {
            String[] termsArr = terms[i].split(" ");
            
            termsMap.put(termsArr[0], Integer.parseInt(termsArr[1]));
        }
        
        String[] todayArr = today.split("\\.");
        
        int todayYear = Integer.parseInt(todayArr[0]);
        int todayMonth = Integer.parseInt(todayArr[1]);
        int todayDay = Integer.parseInt(todayArr[2]);
        
        for(int i=0;i<privacies.length;i++) {
            String[] privaciesArr = privacies[i].split(" ");
            int month = termsMap.get(privaciesArr[1]);
            
            String[] endTime = privaciesArr[0].split("\\.");

            int endYear = Integer.parseInt(endTime[0]);
            int endMonth = Integer.parseInt(endTime[1]) + month;
            int endDay = Integer.parseInt(endTime[2]);
            
            int endNum = endDay + endMonth * 28 + endYear * 28 * 12;
            int todayNum = todayDay + todayMonth * 28 + todayYear * 28 * 12;
            
            if(todayNum > endNum - 1) {
            	list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList();

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today, formatter);

        Map<String, Integer> termsMap = new HashMap<>();

        for(int i=0; i<terms.length; i++) {
            String[] term = terms[i].split(" ");
            termsMap.put(term[0], Integer.valueOf(term[1]));
        }

        for(int i=0; i<privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            LocalDate privacyRegisterYmdt = LocalDate.parse(privacy[0], formatter).plusMonths(termsMap.get(privacy[1])).minusDays(1);


            if (privacyRegisterYmdt.isBefore(date)) {
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(String today, String[] terms, String[] privacies) {
	    ArrayList<Integer> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] temp = term.split(" ");
            int date = Integer.parseInt(temp[1]) * 28;
            map.put(temp[0], date);
        }

        String[] todaySplited = today.split("\\.");
        int todayYear = Integer.parseInt(todaySplited[0]);
        int todayMonth = Integer.parseInt(todaySplited[1]);
        int todayDate = Integer.parseInt(todaySplited[2]);

        int index = 0;
        for (String data : privacies) {
            String[] temp = data.split(" ");
            String term = temp[1];
            String[] dataSplited = temp[0].split("\\.");
            int dataYear = Integer.parseInt(dataSplited[0]);
            int dataMonth = Integer.parseInt(dataSplited[1]);
            int dataDate = Integer.parseInt(dataSplited[2]);

            int diff = 0;
            diff += (todayYear - dataYear) * (28 * 12);
            diff += (todayMonth - dataMonth) * 28;
            diff += (todayDate - dataDate);

            System.out.println(diff + " " + map.get(term));

            if (map.get(term) <= diff) {
                list.add(index + 1);
            }

            index++;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
	} */
	
}
