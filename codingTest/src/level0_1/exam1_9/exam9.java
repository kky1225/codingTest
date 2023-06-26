package level0_1.exam1_9;

import java.util.Scanner;

/*
 * 문제 이름 : 문자열 붙여서 출력하기
 * 문제 설명 : 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다. 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
 * 입출력 예 : apple pen, applepen
 * 입출력 예 : Hello World!, HelloWorld!
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181946
 * 
 * */
public class exam9 {

	// 내 풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        sc.close();
        
        System.out.println(a + b);
    }
	
	// 남의 풀이
	/* public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(br.readLine().replaceAll(" ", ""));
	} */

}
