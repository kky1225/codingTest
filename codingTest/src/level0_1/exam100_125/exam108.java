package level0_1.exam100_125;

/*
 * 문제 이름 : 조건 문자열
 * 문제 설명 : 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다. 두 수가 n과 m이라면
			">", "=" : n >= m
			"<", "=" : n <= m
			">", "!" : n > m
			"<", "!" : n < m
			두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181934
 * 
 * */
public class exam108 {

	// 내 풀이
	public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")) {
            if(eq.equals("=")) {
                return n <= m ? 1 : 0;
            }else {
                return n < m ? 1 : 0;
            }
        }else {
            if(eq.equals("=")) {
                return n >= m ? 1 : 0;
            }else {
                return n > m ? 1 : 0;
            }
        }
    }
	
	// 남의 풀이
	/* public int solution(String ineq, String eq, int n, int m) {
	    Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
	} */
	
}
