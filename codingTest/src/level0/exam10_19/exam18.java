package level0.exam10_19;

/*
 * 문제 이름 : 배열 원소의 길이
 * 문제 설명 : 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 * 입출력 예 : ["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.
 * 입출력 예 : ["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120854
 * 
 * */
public class exam18 {

	// 내 풀이
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
	        
		for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }
	        
	    return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    } */
	
}
