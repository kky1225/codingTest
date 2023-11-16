package level2.exam30_39;

/*
 * 문제 이름 : 모음 사전
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/84512
 * */
public class exam37 {

	// 내 풀이
	public int solution(String word) {
        int index = 1;
        StringBuilder sb = new StringBuilder("A");

        while(!sb.toString().equals(word)) {
            makeDictionary(sb);

            index += 1;
        }

        return index;
    }

    public void makeDictionary(StringBuilder sb) {
        if(sb.length() < 5) {
            sb.append("A");
        }else {
            checkWord(sb);
        }
    }

    public void checkWord(StringBuilder sb) {
        if(sb.charAt(sb.length() - 1) == 'A') {
            sb.deleteCharAt(sb.length() - 1);

            sb.append("E");
        }else if(sb.charAt(sb.length() - 1) == 'E') {
            sb.deleteCharAt(sb.length() - 1);

            sb.append("I");
        }else if(sb.charAt(sb.length() - 1) == 'I') {
            sb.deleteCharAt(sb.length() - 1);

            sb.append("O");
        }else if(sb.charAt(sb.length() - 1) == 'O') {
            sb.deleteCharAt(sb.length() - 1);

            sb.append("U");
        }else {
            sb.deleteCharAt(sb.length() - 1);

            checkWord(sb);
        }
    }
		
	
	// 남의 풀이
	/* public int solution(String word) {
        int answer = 0, per = 3905;
        for(String s : word.split("")) answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        return answer;
    } */
    
    // 남의 풀이
 	/*List<String> list = new ArrayList<>();
    void dfs(String str, int len) {
        if(len > 5) return;
        list.add(str);
        for(int i = 0; i < 5; i++) dfs(str + "AEIOU".charAt(i), len + 1);
    }
    public int solution(String word) {
        dfs("", 0);
        return list.indexOf(word);
    } */

}
