package level0.exam70_79;

/*
 * 문제 이름 : 7의 개수
 * 문제 설명 : 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : [7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
 * 입출력 예 : [10, 29]에는 7이 없으므로 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120912
 * 
 * */
public class exam72 {

	// 내 풀이
	public int solution(int[] array) {
		int answer = 0;
		
		for(int i : array) {
			String strI = String.valueOf(i);
			
			for(char c : strI.toCharArray()) 
				if(String.valueOf(c).equals("7"))
					answer++;
			
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int[] array) {
	    int answer = 0;

        for(int i : array){
            while(i>0){
                if(i%10 == 7) answer++;
                i/=10;
            }
        }        
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] array) {
	    return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
	} */
	
}
