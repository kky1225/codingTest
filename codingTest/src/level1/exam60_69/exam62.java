package level1.exam60_69;

/*
 * 문제 이름 : 옹알이 (2)
 * 문제 설명 : 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : ["aya", "yee", "u", "maa"]에서 발음할 수 있는 것은 "aya"뿐입니다. 따라서 1을 return합니다.
 * 입출력 예 : ["ayaye", "uuuma", "yeye", "yemawoo", "ayaayaa"]에서 발음할 수 있는 것은 "aya" + "ye" = "ayaye", "ye" + "ma" + "woo" = "yemawoo"로 2개입니다. "yeye"는 같은 발음이 연속되므로 발음할 수 없습니다. 따라서 2를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/133499
 * 
 * */
public class exam62 {

	// 내 풀이
	public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling) {
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }
            
            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            
            if(s.trim().equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String[] babbling) {
        int answer = 0;
        String[] filter = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length;i++){
            for(int j = 0; j < filter.length; j++){
                if(!babbling[i].contains("ayaaya") && !babbling[i].contains("yeye") &&!babbling[i].contains("woowoo")&&!babbling[i].contains("mama"))
                babbling[i] = babbling[i].replace(filter[j]," ");   
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i] == "")   answer ++;
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(String[] babbling) {
	    int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) continue;
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "");
            if(babbling[i].length() == 0) answer++;
        }
        return answer;
	} */
	
}
