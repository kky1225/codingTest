package level0.exam80_89;

/*
 * 문제 이름 : 유한소수 판별하기
 * 문제 설명 : 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다. 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다. 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 분수 7/20은 기약분수 입니다. 분모 20의 소인수가 2, 5 이기 때문에 유한소수입니다. 따라서 1을 return합니다.
 * 입출력 예 : 분수 11/22는 기약분수로 나타내면 1/2 입니다. 분모 2는 소인수가 2 뿐이기 때문에 유한소수 입니다. 따라서 1을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120878
 * 
 * */
public class exam86 {

	// 내 풀이
	public int solution(int a, int b) {
		int answer = 1;
		int divide = 2;
		
		for(int i=1; i<=a; i++) {
			if(a % i == 0 && b % i ==0) {
				a /= i;
				b /= i;
			}
		}
		
        while(b > 1) {
			if(b % divide == 0) {
				b /= divide;
				
				if(divide != 2 && divide != 5) {
					answer = 2;
					break;
				}
			}else {
				divide++;
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int a, int b) {
        int answer = 0;

        for (;b%2 == 0;) {
            b = b/2;
        }
        for (;b%5 == 0;) {
            b = b/5;
        }

        if ((a/(double)b)%1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    } */
	
}
