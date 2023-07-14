package level0_1.exam80_89;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 배열 만들기 5
 * 문제 설명 : 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다. 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181912
 * 
 * */
public class exam81 {

	// 내 풀이
	public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String intStr : intStrs) {
            if(Integer.parseInt(intStr.substring(s, s + l)) > k) {
                list.add(Integer.parseInt(intStr.substring(s, s + l)));
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public int[] solution(String[] intStrs, int k, int s, int l) {
	    return Stream.of(intStrs).mapToInt(str -> Integer.parseInt(str.substring(s,s+l))).filter(i->i>k).toArray();
	} */
	
}
