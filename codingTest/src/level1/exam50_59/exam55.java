package level1.exam50_59;

/*
 * 문제 이름 : 카드 뭉치
 * 문제 설명 : 코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
			예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"], 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 
			"want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
			문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.
			cards1	cards2	goal	result
 * 입출력 예 : ["i", "drink", "water"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"Yes"
 * 입출력 예 : ["i", "water", "drink"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"No"
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/159994
 * 
 * */
public class exam55 {

	// 내 풀이
	public String solution(String[] cards1, String[] cards2, String[] goal) { 
        int index1 = 0;
        int index2 = 0;
        
        for(int i=0;i<goal.length;i++) {
            if(index1 < cards1.length && cards1[index1].equals(goal[i])) {
                index1 += 1;
            }else if(index2 < cards2.length && cards2[index2].equals(goal[i])) {
                index2 += 1;
            }else {
                return "No";
            }
        }
        
        return "Yes";
    }
	
	// 남의 풀이
	/* public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for(String str : goal) {
            qGoal.offer(str);
        }

        for(String card : cards1) {
            qCard1.offer(card);
        }

        for(String card : cards2) {
            qCard2.offer(card);
        }

        while(!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if(str.equals(qCard1.peek())) qCard1.poll();
            else if(str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";
    } */
	
	// 남의 풀이
	/* public String solution(String[] cards1, String[] cards2, String[] goal) {
	    boolean isMatched = Arrays.stream(goal)
                .allMatch(word -> {
                    if (index1 < cards1.length && cards1[index1].equals(word)) {
                        index1++;
                        return true;
                    }
                    if (index2 < cards2.length && cards2[index2].equals(word)) {
                        index2++;
                        return true;
                    }
                    return false;
                });

        return isMatched ? "Yes" : "No";
	} */
	
}
