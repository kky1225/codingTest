package level0_1.exam30_39;

/*
 * 문제 이름 : A 강조하기
 * 문제 설명 : 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
 * 입출력 예 : 0번, 5번, 9번, 15번 인덱스의 "a"는 소문자이므로 전부 대문자로 고쳐줍니다. 다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다. 따라서 "AbstrAct AlgebrA"를 return 합니다.
 * 입출력 예 : 0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 "A"가 아닌 대문자이므로 전부 소문자로 고쳐줍니다. 5번 인덱스의 "a"는 소문자이므로 대문자로 고쳐줍니다. 다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다. 따라서 "progrAmmers"를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181889
 * 
 * */
public class exam39 {

	// 내 풀이
	public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(char myChar : myString.toCharArray()) {
            if(myChar == 'a') {
                sb.append('A');
                continue;
            }
            
            if(myChar != 'A') {
                sb.append(String.valueOf(myChar).toLowerCase());
                continue;
            }
            
            sb.append(myChar);
        }
        
        return sb.toString();
    }
	
	// 남의 풀이
	/* public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

        return myString;
    } */
	
	// 남의 풀이
	/* public String solution(String myString) {
	    return myString.toLowerCase().replaceAll("a", "A");
	} */

}
