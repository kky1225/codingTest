package level0_1.exam20_29;

import java.util.Scanner;

/*
 * 문제 이름 : 홀짝 구분하기
 * 문제 설명 : 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 * 입출력 예 : 100, 100 is even
 * 입출력 예 : 1, 1 is odd
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181944
 * 
 * */
public class exam25 {

	// 내 풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.close();
        
        if(n % 2 == 0) {
            System.out.println(n + " is even");
        }else {
            System.out.println(n + " is odd");
        }
    }

}
