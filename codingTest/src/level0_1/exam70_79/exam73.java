package level0_1.exam70_79;

/*
 * 문제 이름 : 주사위 게임 2
 * 문제 설명 : 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
			세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
			세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
			세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
			세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181930
 * 
 * */
public class exam73 {

	// 내 풀이
	public int solution(int a, int b, int c) {
        int count = 0;
        
        if(a == b) {
            count++;
        }
        
        if(a == c) {
            count++;
        }
        
        if(b == c) {
            count++;
        }
        
        if(count == 0) {
            return a + b + c;
        }
        
        if(count == 1) {
            return (a + b + c) * (a * a + b * b + c * c);
        }
        
        return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
    }
	
	// 남의 풀이
	/* public int solution(int a, int b, int c) {
	    int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(a, 0) + 1);
        map.put(c, map.getOrDefault(a, 0) + 1);

        if (map.size() == 1) {
            answer = (int) ((3 * a) * (3 * Math.pow(a, 2)) * (3 * Math.pow(a, 3)));
        } else if (map.size() == 2) {
            answer = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } else if (map.size() == 3) {
            answer = (a + b + c);
        }
        return answer;
	} */
	
}
