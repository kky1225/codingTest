package level0.exam90_99;

/*
 * 문제 이름 : 문자열 밀기
 * 문제 설명 : 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : "hello"를 오른쪽으로 한 칸 밀면 "ohell"가 됩니다.
 * 입출력 예 : "apple"은 몇 번을 밀어도 "elppa"가 될 수 없습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120921
 * 
 * */
public class exam90 {

	// 내 풀이
	public int solution(String A, String B) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(A);
		
		for(int i=0; i<A.length(); i++) {
			if(sb.toString().equals(B)) {
				break;
			}
			
			sb.delete(0, sb.length());
			sb.append(A.substring(A.length()-1));
			sb.append(A.substring(0, A.length()-1));
            
            A = sb.toString();
			
			answer++;
		}
		
		if(answer == A.length()) answer = -1;
		
        return answer;
	}
	
	// 남의 풀이
	/* public int solution(String A, String B) {
	 	StringBuilder stringBuilder = new StringBuilder(a);

        if (a.equals(b)) return 0;
        for (int i = 0; i < a.length(); i++) {
            stringBuilder.insert(0, stringBuilder.charAt(stringBuilder.length() - 1));
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            System.out.println(stringBuilder);
            if (stringBuilder.toString().equals(b)) return i + 1;
        }
        return -1;
	} */
	
	// 남의 풀이
	/* public int solution(String A, String B) {
	 	return (B+B).indexOf(A);
    } */
	
}
