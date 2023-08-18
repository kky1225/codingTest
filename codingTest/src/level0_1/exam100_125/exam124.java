package level0_1.exam100_125;

import java.util.Arrays;

/*
 * 문제 이름 : 주사위 게임 3
 * 문제 설명 : 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
			네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
			세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
			주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
			어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
			네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
			네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181916
 * 
 * */
public class exam124 {

	// 내 풀이
	public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        
        Arrays.sort(arr);
        
        int max = 0;
        
        for(int i=0;i<arr.length;i++) {
            int count = 0;
            
            for(int j=i;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if(count > max) {
                max = count;
            }
        }
        
        if(max == 4) {
            return 1111 * arr[0];
        }
        
        if(max == 3) {
            if(arr[0] == arr[1]) {
                return (int) Math.pow(10 * arr[0] + arr[3], 2);
            } 
            
            return (int) Math.pow(10 * arr[3] + arr[0], 2);
        }
        
        if(max == 2) {
            if(arr[0] == arr[1] && arr[2] == arr[3]) {
                return (arr[0] + arr[2]) * (int) Math.abs(arr[0] - arr[2]);
            }
            
            if(arr[0] == arr[1]) {
                return arr[2] * arr[3];
            }
            
            if(arr[1] == arr[2]) {
                return arr[0] * arr[3];
            }
            
            return arr[0] * arr[1];
        }
        
        return arr[0];
    }
	
	// 남의 풀이
	/* public int solution(int a, int b, int c, int d) { 
	    if(a == b && b==c && c==d) {
            return 1111 * a;
        }
        if(a==b && b==c) {
            return triple(a,d);
        }
        if(a==b && b==d){
            return triple(a,c);
        }
        if(b==c && c==d) {
            return triple(b,a);
        }
        if(a==c && c==d) {
            return triple(a,b);
        }
        if(a==b && c==d) {
            return double1(a,c);
        }
        if(a==c && b==d) {
            return double1(a,b);
        }
        if(a==d && b==c) {
            return double1(a,b);
        }
        if(a==b) 
            return double2(c,d);
        if(a==c)
            return double2(b,d);
        if(a==d)
            return double2(b,c);
        if(b==c)
            return double2(a,d);
        if(b==d)
            return double2(a,c);
        if(c==d)
            return double2(a,b);
        return Math.min(Math.min(a,b), Math.min(c,d));
    }

    private int double2(int q, int r) {
        return q * r;
    }

    private int double1(int p, int q) {
        return (p+q) * Math.abs(p-q);
    }

    private int triple(int p, int q) {
        return (10 * p + q) * (10 * p + q);
    }
	} */
	
}
