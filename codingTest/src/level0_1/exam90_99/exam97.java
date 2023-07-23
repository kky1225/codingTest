package level0_1.exam90_99;

/*
 * 문제 이름 : 문자열 묶기
 * 문제 설명 : 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181855
 * 
 * */
public class exam97 {

	// 내 풀이
	public int solution(String[] strArr) {
        int[] intArr = new int[100000];
        
        for(String str : strArr) {
            intArr[str.length()] += 1;
        }
        
        int answer = 0;
        
        for(int i=0;i<intArr.length;i++) {
            if(intArr[i] > answer) {
                answer = intArr[i];
            }
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String[] strArr) {
        int answer = 0;

        int[] lengArr = new int[31];

        for(int i=0; i<strArr.length; i++) {
            lengArr[strArr[i].length()]++;
        }

        for(int i=0; i<=30; i++) {
            answer = Math.max(answer, lengArr[i]);
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(String[] strArr) {
	    return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values().stream().max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList()).size();
	} */
	
}
