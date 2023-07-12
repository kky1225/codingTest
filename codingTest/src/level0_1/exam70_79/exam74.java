package level0_1.exam70_79;

import java.util.Scanner;

/*
 * 문제 이름 : 문자열 돌리기
 * 문제 설명 : 문자열 str이 주어집니다. 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181945
 * 
 * */
public class exam74 {

	// 내 풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        sc.close();
        
        for(char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
	
}
