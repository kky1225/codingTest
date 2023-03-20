package level0.exam70_79;

import java.util.ArrayList;

/*
 * 문제 이름 : 소인수분해
 * 문제 설명 : 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 12를 소인수분해하면 2 * 2 * 3 입니다. 따라서 [2, 3]을 return합니다.
 * 입출력 예 : 17은 소수입니다. 따라서 [17]을 return 해야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120852
 * 
 * */
public class exam71 {

	// 내 풀이
	public int[] solution(int n) {
		ArrayList<Integer> answerList = new ArrayList<>();
		
		for(int i=2; i<=n; i++) {
			while(n > 0) {
				if(n % i == 0) {
					n /= i;
					if(!answerList.contains(i)) {
						answerList.add(i);
					}
				}else {
					break;
				}
			}
		}
		
		int[] answer = new int[answerList.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int[] solution(int n) {
	    LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();

        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }

//        System.out.println(primeNumbers);

        return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
	} */
	
}
