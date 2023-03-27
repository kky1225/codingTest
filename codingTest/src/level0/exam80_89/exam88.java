package level0.exam80_89;

/*
 * 문제 이름 : 특이한 정렬
 * 문제 설명 : 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : 4에서 가까운 순으로 [4, 5, 3, 6, 2, 1]을 return합니다. 3과 5는 거리가 같으므로 더 큰 5가 앞에 와야 합니다. 2와 6은 거리가 같으므로 더 큰 6이 앞에 와야 합니다.
 * 입출력 예 : 30에서 가까운 순으로 [36, 40, 20, 47, 10, 6, 7000, 10000]을 return합니다. 20과 40은 거리가 같으므로 더 큰 40이 앞에 와야 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120880
 * 
 * */
public class exam88 {

	// 내 풀이
	public int[] solution(int[] numlist, int n) {
		int temp = 0;
		
		for (int i = 0; i < numlist.length; i++) {
            for (int j = i; j < numlist.length; j++) {
                if(Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
                    temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }else if(Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n) && numlist[i] < numlist[j]) {
                    temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }
		
		return numlist;
	}
	
	// 남의 풀이
	/* public int[] solution(int[] numlist, int n) {
        int size = numlist.length;
        for(int i=0; i<size-1; i++){
            for(int k=i+1; k<size; k++){
                int a = (numlist[i] - n) * (numlist[i] > n ? 1 : -1);
                int b = (numlist[k] - n) * (numlist[k] > n ? 1 : -1);
                if(a > b || (a == b && numlist[i] < numlist[k])){
                    int temp = numlist[i];
                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }

            }
        }
        return numlist;
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] numlist, int n) {
	    return Arrays.stream(numList)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
	} */
	
}
