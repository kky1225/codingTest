package level0_1.exam90_99;

import java.util.Scanner;

/*
 * 문제 이름 : 문자열 반복해서 출력하기
 * 문제 설명 : 문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181950
 * 
 * */
public class exam91 {

	// 내 풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        sc.close();
        
        System.out.println(str.repeat(n));
    }
	
}
