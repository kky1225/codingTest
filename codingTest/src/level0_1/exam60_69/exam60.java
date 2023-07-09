package level0_1.exam60_69;

/*
 * 문제 이름 : 순서 바꾸기
 * 문제 설명 : 정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [2, 1, 6]에서 첫 번째 이후의 원소는 [1, 6]이고 첫 번째까지의 원소는 [2]입니다. 두 리스트를 이어 붙이면 [1, 6, 2]가 됩니다.
 * 입출력 예 : [5, 2, 1, 7, 5]에서 세 번째 이후의 원소는 [7, 5]이고 세 번째까지의 원소는 [5, 2, 1]입니다. 두 리스트를 이어 붙이면 [7, 5, 5, 2, 1]가 됩니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181891
 * 
 * */
public class exam60 {

	// 내 풀이
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        
        for(int i=n;i<num_list.length;i++) {
            answer[index++] = num_list[i];
        }
        
        for(int i=0;i<n;i++) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
	    int[] copy = Arrays.copyOf(numList, numList.length * 2);

        System.arraycopy(numList, 0, copy, numList.length, numList.length);
        return Arrays.copyOfRange(copy, n, n + numList.length);
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
	    return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
	} */
	
}
