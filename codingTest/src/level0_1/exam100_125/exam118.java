package level0_1.exam100_125;

import java.util.Scanner;

/*
 * 문제 이름 : 대소문자 바꿔서 출력하기
 * 문제 설명 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181949
 * 
 * */
public class exam118 {

	// 내 풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
         sc.close();
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : a.toCharArray()) {
            if(Character.isLowerCase(c)) {
                sb.append(String.valueOf(c).toUpperCase());
            }else {
                sb.append(String.valueOf(c).toLowerCase());
            }
        }
        
        System.out.println(sb.toString());
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int k) {
	    Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.print((char)(c+32));
            }
            else {
                System.out.print((char)(c-32));
            }
        }
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int k) {
	    Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer sb = new StringBuffer();
        for (char ch : a.toCharArray()) {
            if ('a' <= ch && ch <= 'z')
                sb.append((char)(ch - ('a' - 'A')));
            else 
                sb.append((char)(ch + ('a' - 'A')));
        }
        System.out.println(sb.toString());
	} */
	
}
