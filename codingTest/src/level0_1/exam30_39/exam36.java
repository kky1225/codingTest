package level0_1.exam30_39;

/*
 * 문제 이름 : 글자 이어 붙여 문자열 만들기
 * 문제 설명 : 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 my_string에서 인덱스 3, 5, 6, 11, 12, 14, 16, 17에 해당하는 글자는 각각 g, o, r, m, r, a, p, e이므로 my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, r, o, g, r, a, m, m, e, r, s입니다. 따라서 "programmers"를 return 합니다.
 * 입출력 예 : 예제 2번의 my_string에서 인덱스 0, 1, 2, 3에 해당하는 글자는 각각 z, p, i, a이므로 my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, i, z, z, a입니다. 따라서 "pizza"를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181915
 * 
 * */
public class exam36 {

	// 내 풀이
	public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for(int index : index_list) {
            sb.append(my_string.charAt(index));
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int[] index_list) {
	    StringBuffer sb = new StringBuffer();
        for (int index : index_list)
            sb.append(my_string.charAt(index));
        return sb.toString();
	} */
	
	// 남의 풀이
	/* public String solution(String my_string, int[] index_list) {
        return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
    } */

}
