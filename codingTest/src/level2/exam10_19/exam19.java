package level2.exam10_19;

import java.util.HashSet;
import java.util.Set;

/*
 * 문제 이름 : 연속 부분 수열 합의 개수
 * 문제 설명 : 철호는 수열을 가지고 놀기 좋아합니다. 어느 날 철호는 어떤 자연수로 이루어진 원형 수열의 연속하는 부분 수열의 합으로 만들 수 있는 수가 모두 몇 가지인지 알아보고 싶어졌습니다. 원형 수열이란 일반적인 수열에서 처음과 끝이 연결된 형태의 수열을 말합니다. 예를 들어 수열 [7, 9, 1, 1, 4] 로 원형 수열을 만들면 다음과 같습니다.
			원형 수열은 처음과 끝이 연결되어 끊기는 부분이 없기 때문에 연속하는 부분 수열도 일반적인 수열보다 많아집니다. 원형 수열의 모든 원소 elements가 순서대로 주어질 때, 원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수를 return 하도록 solution 함수를 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/131701
 * */
public class exam19 {

	// 내 풀이
	public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int index = 1;
        
        while(elements.length >= index) {
            sumElements(set, elements, index++);
        }
        
        return set.size();
    }
    
    public void sumElements(Set<Integer> set, int[] elements, int index) {
        for(int i=0;i<elements.length;i++) {
            int sum = 0;
            
            for(int j=i;j<i+index;j++) {
                if(j >= elements.length) {
                    sum += elements[j - elements.length];
                }else {
                    sum += elements[j];
                }
            }
            
            set.add(sum);
        }
    }
    
	// 남의 풀이
	/* public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i=1; i<=elements.length; i++) {
            for (int j=0; j<elements.length; j++) {
                int sum = 0;
                for (int k=j; k<j+i; k++) {
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }

        return set.size();
    } */

}
