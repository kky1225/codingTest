package level0_1.exam40_49;

/*
 * 문제 이름 : 배열 비교하기
 * 문제 설명 : 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
			두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
			배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
			두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번에서는 arr1의 길이는 2이고 arr2의 길이는 3으로 arr2의 길이가 더 깁니다. 따라서 arr2가 arr1보다 크므로 -1을 return 합니다.
 * 입출력 예 : 예제 2번에서는 arr1의 길이과 arr2의 길이가 4로 같습니다. arr1의 모든 원소의 합은 100 + 17 + 84 + 1 = 202이고 arr2의 모든 원소의 합은 55 + 12 + 65 + 36 = 168으로 arr1의 모든 원소의 합이 더 큽니다. 따라서 arr1이 arr2보다 크므로 1을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181856
 * 
 * */
public class exam49 {

	// 내 풀이
	public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length) {
            return 1;
        }
        
        if(arr2.length > arr1.length) {
            return -1;
        }
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i : arr1) {
            sum1 += i;
        }
        
        for(int i : arr2) {
            sum2 += i;
        }
        
        if(sum1 > sum2) {
            return 1;
        }
        
        if(sum2 > sum1) {
            return -1;
        }
        
        return 0;
    }
	
	// 남의 풀이
	/* public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        int arr1Sum = 0, arr2Sum = 0;
        for (int i = 0;i < arr1.length;i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }
        return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);

        return arr;
    } */

}
