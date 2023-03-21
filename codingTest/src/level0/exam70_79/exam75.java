package level0.exam70_79;

/*
 * 문제 이름 : 영어가 싫어요
 * 문제 설명 : 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 * 입출력 예 : "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.
 * 입출력 예 : "onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120894
 * 
 * */
public class exam75 {

	// 내 풀이
	public long solution(String numbers) {
		long answer = 0;
		StringBuilder strC = new StringBuilder();
		StringBuilder strAnswer = new StringBuilder();
		
		for(char c : numbers.toCharArray()) {
			strC.append(String.valueOf(c));
			
			switch (strC.toString()) {
				case "zero" : {
					strAnswer.append("0");
					strC = new StringBuilder();
					break;
				}case "one" : {
					strAnswer.append("1");
					strC = new StringBuilder();
					break;
				}case "two" : {
					strAnswer.append("2");
					strC = new StringBuilder();
					break;
				}case "three" : {
					strAnswer.append("3");
					strC = new StringBuilder();
					break;
				}case "four" : {
					strAnswer.append("4");
					strC = new StringBuilder();
					break;
				}case "five" : {
					strAnswer.append("5");
					strC = new StringBuilder();
					break;
				}case "six" : {
					strAnswer.append("6");
					strC = new StringBuilder();
					break;
				}case "seven" : {
					strAnswer.append("7");
					strC = new StringBuilder();
					break;
				}case "eight" : {
					strAnswer.append("8");
					strC = new StringBuilder();
					break;
				}case "nine" : {
					strAnswer.append("9");
					strC = new StringBuilder();
					break;
				}
			}
		}
		
		answer = Long.parseLong(strAnswer.toString());
		
        return answer;
	}
	
	// 남의 풀이
	/* public long solution(String numbers) {
	    String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
	} */
	
	// 남의 풀이
	/* public long solution(String numbers) {
	    return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
	} */
}
