package level2.exam1_9;

/*
 * 문제 이름 : 다음 큰 숫자
 * 문제 설명 : 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
			조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
			조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
			조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
			예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다. 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12911
 * */
public class exam7 {

	// 내 풀이
	public int solution(int n) {
        for(int i=n+1;i<1000000;i++) {
            if(checkOne(Integer.toBinaryString(i)) == checkOne(Integer.toBinaryString(n))) {
                return i;
            }
        }
        
        return 1000000;
    }
    
    public int checkOne(String binary) {
        int count = 0;
        
        for(char c : binary.toCharArray()) {
            if(c == '1') {
                count++;
            }
        }
        
        return count;
    }
	
	// 남의 풀이
	/* public int solution(int n) {
        String nBin = Integer.toBinaryString(n);
        nBin = nBin.replace("0", "");
        int len = nBin.length();

        while(Integer.toBinaryString(n+1).replace("0", "").length() != len) {
            n++;
        }
        return n+1;
    } */

}