package level0.exam40_49;

/*
 * 문제 이름 : 가위 바위 보
 * 문제 설명 : 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
 * 입출력 예 : "2"는 가위이므로 바위를 나타내는 "0"을 return 합니다.
 * 입출력 예 : "205"는 순서대로 가위, 바위, 보이고 이를 모두 이기려면 바위, 보, 가위를 순서대로 내야하므로 “052”를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120839
 * 
 * */
public class exam42 {

	// 내 풀이
	public String solution(String rsp) {
		StringBuilder answer = new StringBuilder();
		String strC = "";
		
		for(char c : rsp.toCharArray()) {
			strC = String.valueOf(c);
			
			if(strC.equals("2"))
				answer.append("0");
			else if(strC.equals("0"))
				answer.append("5");
			else if(strC.equals("5")) 
				answer.append("2");
			
		}
		
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String rsp) {
		char[] cRsp = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();

        for(int i=0; i < cRsp.length; i++) {
            switch(cRsp[i]) {
                case '0' :
                    answer.append("5");
                    break;
                case '2' :
                    answer.append("0");
                    break;
                case '5' :
                    answer.append("2");
                    break;
            }
        }
        return answer.toString();
	} */
	
	// 남의 풀이
	/* public String solution(String rsp) {
		return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
	} */
	
}
