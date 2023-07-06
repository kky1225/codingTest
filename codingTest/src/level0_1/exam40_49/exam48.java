package level0_1.exam40_49;

/*
 * 문제 이름 : 배열의 길이에 따라 다른 연산하기
 * 문제 설명 : 정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 arr의 길이는 5로 홀수입니다. 따라서 arr의 짝수 인덱스 0, 2, 4에 주어진 n 값인 27을 더하면 [76, 12, 127, 276, 60]이 됩니다. 따라서 [76, 12, 127, 276, 60]를 return 합니다.
 * 입출력 예 : 예제 2번의 arr의 길이는 4로 짝수입니다. 따라서 arr의 홀수 인덱스 1, 3에 주어진 n 값인 100을 더하면 [444, 655, 666, 877]이 됩니다. 따라서 [444, 655, 666, 877]를 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181854
 * 
 * */
public class exam48 {

	// 내 풀이
	public int[] solution(int[] arr, int n) {
        int index = arr.length;
        
        for(int i=0;i<arr.length;i++) {
            if(index % 2 == 0 && i % 2 != 0) {
                arr[i] += n;
            }else if(index % 2 != 0 && i % 2 == 0) {
                arr[i] += n;
            }
        }
        
        return arr;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0)).toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    } */

}
