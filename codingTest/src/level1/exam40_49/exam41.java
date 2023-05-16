package level1.exam40_49;

/*
 * 문제 이름 : 숫자 문자열과 영단어
 * 문제 설명 : 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다. 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
			1478 → "one4seveneight"
			234567 → "23four5six7"
			10203 → "1zerotwozero3"
			이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
			0 zero	1 one	2 two	3 three	4 four	5 five	6 six	7 seven	8 eight	9 nine
 * 입출력 예 : "one4seveneight", 1478
 * 입출력 예 : "23four5six7", 234567
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/81301
 * 
 * */
public class exam41 {

	// 내 풀이
	public int solution(String s) {
		s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        
        return Integer.parseInt(s);
    }
	
	// 남의 풀이
	/* public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    } */
	
	// 남의 풀이
	/* public int solution(String s) {
	    int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
	} */
	
}
