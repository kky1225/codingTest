package level1.exam1_9;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 자연수 뒤집어 배열로 만들기
 * 문제 설명 : 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 입출력 예 : 12345, [5,4,3,2,1]
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * */
public class exam9 {

	// 내 풀이
	public int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
        
        while(n > 0) {
        	list.add((int) (n % 10));
        	n /= 10;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public long solution(long n) {
		String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
	} */
	
	// 남의 풀이
	/* public long solution(long n) {
		return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
	} */
	
}
