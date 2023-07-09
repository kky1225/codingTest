package level0_1.exam50_59;

import java.util.Scanner;

/*
 * 문제 이름 : 덧셈식 출력하기
 * 문제 설명 : 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요. a + b = c
 * 입출력 예 : 4 5, 4 + 5 = 9
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181947
 * 
 * */
public class exam59 {

	// 내 풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
	
}
