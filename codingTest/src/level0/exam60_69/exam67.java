package level0.exam60_69;

/*
 * 문제 이름 : 진료 순서 정하기
 * 문제 설명 : 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 * 입출력 예 : emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
 * 입출력 예 : emergency가 [1, 2, 3, 4, 5, 6, 7]이므로 응급도의 크기 순서대로 번호를 매긴 [7, 6, 5, 4, 3, 2, 1]를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120835
 * 
 * */
public class exam67 {

	// 내 풀이
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		
		for(int i=0; i<emergency.length; i++) {
			answer[i]++;
			for(int j=0; j<emergency.length; j++) {
				if(emergency[j] > emergency[i]) {
					answer[i]++;
				}
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public int[] solution(int[] emergency) {
	    Map<Integer, Integer> map = new HashMap<>();
        int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
        Arrays.sort(emergencySort);
        int size = emergency.length;
        for(int i = 0; i<emergencySort.length; i++){
            int e = emergencySort[i];
            map.put(e, size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] e) {
	    return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
	} */
	
}
