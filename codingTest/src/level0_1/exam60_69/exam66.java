package level0_1.exam60_69;

/*
 * 문제 이름 : 간단한 식 계산하기
 * 문제 설명 : 문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181865
 * 
 * */
public class exam66 {

	// 내 풀이
	public int solution(String binomial) {
        String[] binomialArr = binomial.split(" ");
        
        int a = Integer.parseInt(binomialArr[0]);
        int b = Integer.parseInt(binomialArr[2]);
        
        int answer = 0;
        
        switch (binomialArr[1]) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a * b;
                break;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String binomial) {
	    String[] cal = binomial.split(" ");

        if (cal[1].equals("+")) {
            return (Integer.parseInt(cal[0])) + (Integer.parseInt(cal[2]));
        } else if (cal[1].equals("-")) {
            return (Integer.parseInt(cal[0])) - (Integer.parseInt(cal[2]));
        } else {
            return (Integer.parseInt(cal[0])) * (Integer.parseInt(cal[2]));
        }
	} */
	
}
