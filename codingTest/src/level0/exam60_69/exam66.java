package level0.exam60_69;

/*
 * 문제 이름 : k의 개수
 * 문제 설명 : 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 10부터 50까지 5는 15, 25, 35, 45, 50 총 5번 등장합니다. 따라서 5를 return 합니다.
 * 입출력 예 : 3부터 10까지 2는 한 번도 등장하지 않으므로 0을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120887
 * 
 * */
public class exam66 {

	// 내 풀이
	public int solution(int i, int j, int k) {
		int answer = 0;
		char chK = (char) k;
		
		for(int a=i; a<=j; a++) {
			String strA = String.valueOf(a);
			
			for(int b=0; b<strA.length(); b++)
				if(strA.charAt(b) - '0' == chK) 
					answer++;
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(int i, int j, int k) {
	    int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(int i, int j, int k) {
	    String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
	} */
	
}
