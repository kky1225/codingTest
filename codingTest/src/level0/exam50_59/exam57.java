package level0.exam50_59;

/*
 * 문제 이름 : 숫자 찾기
 * 문제 설명 : 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 29183에서 1은 3번째에 있습니다.
 * 입출력 예 : 232443에서 4는 4번째에 처음 등장합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120897
 * 
 * */
public class exam57 {

	// 내 풀이
	public int solution(int num, int k) {
		int answer = 0;
		int check = 0;
		String strNum = String.valueOf(num);
		String strK = String.valueOf(k);
		
		for(char c : strNum.toCharArray()) {
			answer++;
			if(String.valueOf(c).equals(strK)) {
				check = 1;
				break;
			}
		}
		
		if(check == 0)
			answer = -1;
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int num, int k) {
	    String numStr = String.valueOf(num);
	    String kStr = String.valueOf(k);

	    int answer = numStr.indexOf(kStr);
	    return answer < 0 ? -1 : answer + 1 ;
	} */
	
	// 남의 풀이
	/* public int solution(int num, int k) {
	    return ("-" + num).indexOf(String.valueOf(k));
	} */
	
}
