package level0.exam90_99;

/*
 * 문제 이름 : 옹알이 (1)
 * 문제 설명 : 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : ["aya", "yee", "u", "maa", "wyeoo"]에서 발음할 수 있는 것은 "aya"뿐입니다. 따라서 1을 return합니다.
 * 입출력 예 : ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]에서 발음할 수 있는 것은 "aya" + "ye" = "ayaye", "ye", "ye" + "ma" + "woo" = "yemawoo"로 3개입니다. 따라서 3을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120956
 * 
 * */
public class exam100 {

	// 내 풀이
	public int solution(String[] babbling) {
		int answer = 0;
		String[] sound = {"aya", "ye", "woo", "ma"};
		
		for(String s : babbling) {
			StringBuilder sb = new StringBuilder();
			for(char c : s.toCharArray()) {
				sb.append(c);
				
				for(String so : sound) {
					if(sb.toString().equals(so)) {
						sb.setLength(0);
					}
				}
			}
			
			if(sb.length() == 0) {
				answer += 1;
			}
		}
		
        return answer;
    }
	
    // 남의 풀이
	/* public int solution(String[] babbling) {
		int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(String[] babbling) {
		int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
	} */
	
}
