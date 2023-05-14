package level1.exam30_39;

/*
 * 문제 이름 : 크기가 작은 부분문자열
 * 문제 설명 : 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
			예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
 * 입출력 예 : p의 길이가 1이므로 t의 부분문자열은 "5", "0", 0", "2", "2", "0", "8", "3", "9", "8", "7", "8"이며 이중 7보다 작거나 같은 숫자는 "5", "0", "0", "2", "2", "0", "3", "7" 이렇게 8개가 있습니다.
 * 입출력 예 : p의 길이가 2이므로 t의 부분문자열은 "10", "02", "20", "03"이며, 이중 15보다 작거나 같은 숫자는 "10", "02", "03" 이렇게 3개입니다. "02"와 "03"은 각각 2, 3에 해당한다는 점에 주의하세요
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/147355
 * 
 * */
public class exam39 {

	// 내 풀이
	public int solution(String t, String p) {
        int answer = 0;
        int index = 0;
        
        while(t.length() - p.length() >= index) {
        	StringBuilder sb = new StringBuilder();
        	
        	for(int i=index;i<index+p.length();i++) 
        		sb.append(t.charAt(i));
        	
        	if(Long.parseLong(p) >= Long.parseLong(sb.toString())) 
        		answer += 1;
        	
        	index += 1;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int solution(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    } */
	
	// 남의 풀이
	/* public int solution(String t, String p) {
	    int answer = 0;
        long ip = Long.parseLong(p);

        for(int i=0;i<=t.length()-p.length();i++){
            if(Long.parseLong(t.substring(i,i+p.length()))<=ip){
                answer++;
            }
        }

        return answer;
	} */
	
}
