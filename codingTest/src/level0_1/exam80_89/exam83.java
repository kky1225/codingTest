package level0_1.exam80_89;

/*
 * 문제 이름 : 글자 지우기
 * 문제 설명 : 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181900
 * 
 * */
public class exam83 {

	// 내 풀이
	public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++) {
            boolean check = true;
            
            for(int j : indices) {
                if(i == j) {
                    check = false;
                }
            }
            
            if(check) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int[] indices) {
	    String answer = "";
        Arrays.sort(indices);
        Stack<Character> stack = new Stack<>();

        for (Character c : my_string.toCharArray()) {
            stack.push(c);
        }
        //System.out.println(stack);

        for (int i = indices.length - 1; i >= 0; i--) {
            stack.remove(indices[i]);
        }

        //System.out.println(stack);

        Character[] result = stack.toArray(new Character[stack.size()]);
        StringBuilder sb = new StringBuilder(result.length);
        for (Character c : result) {
            sb.append(c);
        }
        answer = sb.toString();

        return answer;
	} */
	
}
