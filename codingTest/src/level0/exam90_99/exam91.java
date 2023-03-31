package level0.exam90_99;

/*
 * 문제 이름 : 다항식 더하기
 * 문제 설명 : 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
 * 입출력 예 : "3x + 7 + x"에서 동류항끼리 더하면 "4x + 7"입니다.
 * 입출력 예 : "x + x + x"에서 동류항끼리 더하면 "3x"입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120863
 * 
 * */
public class exam91 {

	// 내 풀이
	public String solution(String polynomial) {
		String answer = "";
		String[] arrPolynomial = polynomial.replaceAll(" ", "").split("\\+");
		int a = 0;
		int b = 0;
		
		for(String s : arrPolynomial) {
			if(s.substring(s.length()-1).equals("x") || s.equals("x")) {
				if(s.length() == 1) {
					a += 1;
				}else {
					a += Integer.parseInt(s.substring(0, s.length()-1));
				}
			}else {
				b += Integer.parseInt(s);
			}
		}
		
		if(a > 1)
			answer = a + "x";
		else if(a == 1)
			answer = "x";
		
		if(a > 0) {
			if(b != 0) {
				answer += " + " + b;
			}
		}else {
			answer = "" + b;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public String solution(String polynomial) {
	 	int xCount = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    } */
	
}
