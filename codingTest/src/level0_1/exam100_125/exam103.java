package level0_1.exam100_125;

/*
 * 문제 이름 : 2의 영역
 * 문제 설명 : 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요. 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181837
 * 
 * */
public class exam103 {

	// 내 풀이
	public int[] solution(int[] arr) {
        boolean firstCheck = false;
        int firstIndex = 0;
        int lastIndex = 0;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 2 && !firstCheck) {
                firstCheck = true;
                firstIndex = i;
                lastIndex = i;
            }
            
            if(arr[i] == 2) {
                lastIndex = i;
            }
        }
        
        int[] answer = new int[lastIndex - firstIndex + 1];
        int index = 0;
        
        if(lastIndex == 0) {
            int[] temp = {-1};
            return temp;
        }
        
        for(int i=firstIndex;i<=lastIndex;i++) {
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
	    int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        if (idx.length == 0) return new int[]{-1};
        return IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] arr) {
	    ArrayList<Integer> answer = new ArrayList<Integer>();
        int start = -1;
        int end = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==2){
                start = i;
                break;
            }
        }
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]==2){
                end = i;
                break;
            }
        }
        if(start==-1 && end==-1){
            answer.add(-1);
        } else{
            for(int i = start; i<=end; i++){
                answer.add(arr[i]);
            }
        }

        return answer;
	} */
	
}
