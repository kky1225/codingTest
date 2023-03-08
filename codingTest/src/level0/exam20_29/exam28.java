package level0.exam20_29;

/*
 * 문제 이름 : 삼각형의 완성조건 (1)
 * 문제 설명 : 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다. 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다. 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 가장 큰 변인 3이 나머지 두 변의 합 3과 같으므로 삼각형을 완성할 수 없습니다. 따라서 2를 return합니다.
 * 입출력 예 : 가장 큰 변인 6이 나머지 두 변의 합 5보다 크므로 삼각형을 완성할 수 없습니다. 따라서 2를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120889
 * 
 * */
public class exam28 {

	// 내 풀이
	public int solution(int[] sides) {
		int answer = 0;
        int max = 0;
        int total = 0;
        
        for(int i : sides){
            if(i > max)
                max = i;
            
            total += i;
        }
        
        if(max >= total - max)
            answer = 2;
        else
            answer = 1;

        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] sides) {
		Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        }

        return 2;
	} */
	
	// 남의 풀이
	/* public int solution(int[] sides) {
		int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
	} */
	
}
