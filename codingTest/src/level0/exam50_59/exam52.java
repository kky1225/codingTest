package level0.exam50_59;

/*
 * 문제 이름 : 가장 큰 수 찾기
 * 문제 설명 : 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.
 * 입출력 예 : 9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120899
 * 
 * */
public class exam52 {

	// 내 풀이
	public int[] solution(int[] array) {
		int[] answer = new int[2];
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > answer[0]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] array) {
	    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[] {max, index};
	} */
	
}
