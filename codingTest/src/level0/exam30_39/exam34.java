package level0.exam30_39;

/*
 * 문제 이름 : 배열의 유사도
 * 문제 설명 : 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : "b"와 "c"가 같으므로 2를 return합니다.
 * 입출력 예 : 같은 원소가 없으므로 0을 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120903
 * 
 * */
public class exam34 {

	// 내 풀이
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
        
		for(String s : s1)
            for(String t : s2)
                if(s.equals(t))
                    answer++;
                
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String[] s1, String[] s2) {
		int answer = 0;
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if(set.contains(s)){
                answer++;
            }
        }
        return answer;
	} */
	
	// 남의 풀이
	/* public int solution(String[] s1, String[] s2) {
		Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int)Arrays.stream(s2).filter(set::contains).count();
	} */
	
}
