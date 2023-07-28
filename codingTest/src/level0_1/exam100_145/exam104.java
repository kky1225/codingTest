package level0_1.exam100_145;

/*
 * 문제 이름 : 문자 개수 세기
 * 문제 설명 : 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181902
 * 
 * */
public class exam104 {

	// 내 풀이
	public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char my_char : my_string.toCharArray()) {
            if(Character.isUpperCase(my_char)) {
                answer[my_char - 65] += 1;
            }else {
                answer[my_char - 97 + 26] += 1;
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String my_string) {
	    int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'a')
                answer[c - 'a' + 26]++;
            else
                answer[c - 'A']++;
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
	    return IntStream.concat(IntStream.concat(my_string.chars(), IntStream.rangeClosed('A', 'Z')), IntStream.rangeClosed('a', 'z'))
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .mapToInt(i ->  i.intValue() - 1)
                .toArray();
	} */
	
}
