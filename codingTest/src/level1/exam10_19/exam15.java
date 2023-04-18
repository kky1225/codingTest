package level1.exam10_19;

/*
 * 문제 이름 : 서울에서 김서방 찾기
 * 문제 설명 : String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다. 
 * 입출력 예 : ["Jane", "Kim"] : "김서방은 1에 있다"
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12919
 * 
 * */
public class exam15 {

	// 내 풀이
	public String solution(String[] seoul) {
        int index = 0;
        
        for(String s : seoul) {
        	if(s.equals("Kim")) 
        		break;
        	
        	index += 1;
        }
        
        String answer = "김서방은 " + index + "에 있다";
        
        return answer;
    }
	
	// 남의 풀이
	/* public String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");        
        return "김서방은 "+ x + "에 있다";
    } */
	
}
