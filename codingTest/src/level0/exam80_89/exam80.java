package level0.exam80_89;

/*
 * 문제 이름 : 외계어 사전
 * 문제 설명 : PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : ["p", "o", "s"], ["sod", "eocd", "qixm", "adio", "soo"] : "p", "o", "s" 를 조합해 만들 수 있는 단어가 dic에 존재하지 않습니다. 따라서 2를 return합니다.
 * 입출력 예 : ["z", "d", "x"], ["def", "dww", "dzx", "loveaw"] : "z", "d", "x" 를 조합해 만들 수 있는 단어 "dzx"가 dic에 존재합니다. 따라서 1을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120869
 * 
 * */
public class exam80 {

	// 내 풀이
	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		int cnt = 0;
		
		for(int i=0; i<dic.length; i++) {
			cnt = 0;
			
			for(int j=0; j<spell.length; j++) 
				if(dic[i].contains(spell[j])) 
					cnt++;
			
			if(cnt == spell.length)
				answer = 1;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(String[] spell, String[] dic) {
	    int answer = 2;

        for(String dicS : dic) {
            boolean isRight = true;
            for(String spellS : spell) {
                if(dicS.indexOf(spellS) == -1) {
                    isRight = false;
                    break;
                }
            }

            if(isRight) {
                answer = 1;
                break;
            }
        }

        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(String[] spell, String[] dic) {
	    return Arrays.stream(dic).map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining())).collect(Collectors.toList()).contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;
	} */
}
