package level0_1.exam1_9;

/*
 * 문제 이름 : 정수 부분
 * 문제 설명 : 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 1.42의 정수 부분은 1입니다.
 * 입출력 예 : 69.32의 정수 부분은 69입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181850
 * 
 * */
public class exam2 {

	// 내 풀이
	public int solution(double flo) {
        return (int) flo;
    }
	
	// 남의 풀이
	/* public int solution(double flo) {
        return Integer.parseInt(Double.toString(flo).substring(0, Double.toString(flo).indexOf(".")));
    } */

}
