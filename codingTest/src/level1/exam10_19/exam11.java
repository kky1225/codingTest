package level1.exam10_19;

/*
 * 문제 이름 : 문자열을 정수로 바꾸기
 * 문제 설명 : 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 * 입출력 예 : 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다. str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12925
 * 
 * */
public class exam11 {

	// 내 풀이
	public int solution(String s) {
        int answer = Integer.parseInt(s);
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String s) {
		boolean plus = true;

        int value = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '-') {
                plus = false;

            } else {
                int num = ch - 48;
                value = num + value*10;
            }

        }
        return (plus == true) ? value : -1 * value;
	} */
	
}
