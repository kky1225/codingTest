package level0.exam40_49;

/*
 * 문제 이름 : 암호 해독
 * 문제 설명 : 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다. 암호화된 문자열 cipher를 주고받습니다. 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다. 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째, 24번째 글자를 합친 "attack"을 return합니다.
 * 입출력 예 : "pfqallllabwaoclk" 의 2번째, 4번째, 6번째, 8번째, 10번째, 12번째, 14번째, 16번째 글자를 합친 "fallback"을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120892
 * 
 * */
public class exam43 {

	// 내 풀이
	public String solution(String cipher, int code) {
		StringBuilder answer = new StringBuilder();
		char[] c = cipher.toCharArray();
		
		for(int i=code-1; i<cipher.length(); i+=code) {
			answer.append(c[i]);
		}
		
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String cipher, int code) {
		String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.substring(i, i+1);
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public String solution(String cipher, int code) {
		return IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
	} */
	
}
