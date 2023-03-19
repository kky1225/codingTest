package level0.exam60_69;

/*
 * 문제 이름 : 숨어있는 숫자의 덧셈 (2)
 * 문제 설명 : 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.
 * 입출력 예 : "1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다. 따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120864
 * 
 * */
public class exam69 {

	// 내 풀이
	public int solution(String my_string) {
		int answer = 0;
		
		for(int i=0; i<my_string.length(); i++) {
			StringBuilder temp = new StringBuilder();
			
			if(Character.isDigit(my_string.charAt(i))) {
				while(Character.isDigit(my_string.charAt(i))) {
					temp.append(Character.toString(my_string.charAt(i)));
					i++;
				}
				
				answer += Integer.parseInt(temp.toString());
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(String my_string) {
	    HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String replace = s.replace(s.charAt(i) + "", "");
            if(s.length() - replace.length() == 1){
                set.add(s.charAt(i)+"");
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return String.join("", list);
	} */
	
	// 남의 풀이
	/* public int solution(String my_string) {
	    return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
	} */
	
}
