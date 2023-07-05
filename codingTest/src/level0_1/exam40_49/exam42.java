package level0_1.exam40_49;

/*
 * 문제 이름 : rny_string
 * 문제 설명 : 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 rny_string의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.
 * 입출력 예 : 예제 2번의 rny_string의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181863
 * 
 * */
public class exam42 {

	// 내 풀이
	public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
	
	// 남의 풀이
	/* public String solution(String rny_string) {
        String answer = rny_string;
        String[] arr = answer.split("");
        for(int i = 0 ; i <= arr.length-1 ; i++) {
            if (arr[i].equals("m")) {
                arr[i] = "rn";
            }
        }
        answer =  String.join("",arr);
        return answer;
    } */

}
