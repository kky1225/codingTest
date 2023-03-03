package level0;

/*
 * 문제 이름 : 나이 출력
 * 문제 설명 : 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
 * 입출력 예 : 2022년 기준 40살이므로 1983년생입니다.
 * 입출력 예 : 2022년 기준 23살이므로 2000년생입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120820
 * 
 * */
public class exam5 {

	// 내 풀이
	public int solution(int age) {
        int answer = 0;
        
        answer = 2022 - age + 1;
        
        return answer;
    }
	
	// 남의 풀이

}
