package level0_1.exam20_29;

/*
 * 문제 이름 : 공백으로 구분하기 1
 * 문제 설명 : 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 my_string은 "i love you"로 공백 한 칸으로 나누어진 단어들은 앞에서부터 순서대로 "i", "love", "you" 이므로 ["i", "love", "you"]를 return 합니다.
 * 입출력 예 : 예제 2번의 my_string은 "programmers"로 단어가 하나만 있습니다. 따라서 ["programmers"]를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181869
 * 
 * */
public class exam23 {

	// 내 풀이
	public String[] solution(String my_string) {
        return my_string.split(" ");
    }

}
