package level0_1.exam90_99;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 문제 이름 : 배열의 길이를 2의 거듭제곱으로 만들기
 * 문제 설명 : 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181857
 * 
 * */
public class exam94 {

	// 내 풀이
	public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        int pow = 1;
        
        while(arr.length > pow) {
            pow *= 2;
        }
        
        for(int i=0;i<pow - arr.length;i++) {
            list.add(0);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	// 남의 풀이
	/* public String solution(String my_string, int s, int e) {
        int len = arr.length;
        int tmp = 1;

        while (tmp < len) {
            tmp *= 2;
        }

        int[] answer = new int[tmp];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public String solution(String my_string, int s, int e) {
	    return Arrays.copyOf(arr, (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2))));
	} */
	
}
