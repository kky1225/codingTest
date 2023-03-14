package level0.exam50_59;

/*
 * 문제 이름 : 배열 회전시키기
 * 문제 설명 : 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.
 * 입출력 예 : numbers 가 [4, 455, 6, 4, -1, 45, 6]이고 direction이 "left" 이므로 왼쪽으로 한 칸씩 회전시킨 [455, 6, 4, -1, 45, 6, 4]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120844
 * 
 * */
public class exam51 {

	// 내 풀이
	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			if(direction.equals("left")) {
				if(i == numbers.length - 1)
					answer[i] = numbers[0];
				else
					answer[i] = numbers[i + 1];
			}else {
				if(i == 0) 
					answer[i] = numbers[numbers.length - 1];
				else
					answer[i] = numbers[i - 1];
			}
		}
		
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] numbers, String direction) {
	    int[] answer = new int[numbers.length];

	    if (direction.equals("right")) {
	        answer[0] = numbers[numbers.length -1];
	        for (int i = 0; i < numbers.length - 1; i++) {
	            answer[i + 1] = numbers[i];
	        }
	    } else {
	        answer[answer.length - 1] = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            answer[i - 1] = numbers[i];
	        }
	    }

	    return answer;
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    } */
	
}
