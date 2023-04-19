package level1.exam10_19;

/*
 * 문제 이름 : 음양 더하기
 * 문제 설명 : 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다. 따라서 세 수의 합인 9를 return 해야 합니다.
 * 입출력 예 : signs가 [false,false,true] 이므로, 실제 수들의 값은 각각 -1, -2, 3입니다. 따라서 세 수의 합인 0을 return 해야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/76501
 * 
 * */
public class exam18 {

	// 내 풀이
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++) {
            if(signs[i]) 
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] absolutes, boolean[] signs) {
	    int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int[] absolutes, boolean[] signs) {
	    AtomicInteger index = new AtomicInteger();
        return Arrays.stream(absolutes).reduce(0, (i, i1) -> {
			index.getAndIncrement();
			return signs[index.get() - 1] ? i + i1 : i - i1;
		});
	} */
	
}
