package level0_1.exam60_69;

/*
 * 문제 이름 : x 사이의 개수
 * 문제 설명 : 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181867
 * 
 * */
public class exam67 {

	// 내 풀이
	public int[] solution(String myString) {
        String[] myStringArr = myString.split("x", -1);
        
        int[] answer = new int[myStringArr.length];
        int index = 0;
        
        for(String s : myStringArr) {
            answer[index++] = s.length();
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String myString) {
	    return Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(x -> x.length())
            .toArray();
	} */
	
}
