package level0_1.exam100_145;

/*
 * 문제 이름 : 조건에 맞게 수열 변환하기 2
 * 문제 설명 : 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
			이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다. 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
			단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181881
 * 
 * */
public class exam101 {

	// 내 풀이
	public int solution(int[] arr) {
        int[] nextArr = new int[arr.length];
        
        for(int i=0;i<arr.length;i++) {
            nextArr[i] = arr[i];
        }
        
        int index = 0;
        
        while(true) {
            boolean check = true;
            
            for(int i=0;i<nextArr.length;i++) {
                if(nextArr[i] >= 50 && nextArr[i] % 2 == 0) {
                    nextArr[i] /= 2;
                }else if(nextArr[i] < 50 && nextArr[i] % 2 != 0) {
                    nextArr[i] = nextArr[i] * 2 + 1;
                }
                
                if(nextArr[i] != arr[i]) {
                    check = false;
                }
                
                arr[i] = nextArr[i];
            }
            
            if(check) {
                return index;
            }
            
            index++;
        }
    }
	
	// 남의 풀이
	/* public int solution(int[] arr) {
	    int answer = 0;
        int x = 0;

        while(true){
            int[] tmp = Arrays.copyOfRange(arr,0,arr.length);

            for(int i=0;i<tmp.length;i++){
                if(tmp[i]>=50&&tmp[i]%2==0){
                    tmp[i]/=2;
                }else if(tmp[i]<50&&tmp[i]%2==1){
                    tmp[i]=tmp[i]*2+1;
                }
            }

            boolean check = true;
            for(int i=0;i<tmp.length;i++){
                if(tmp[i]!=arr[i]){
                     check = false;
                    break;
                }
            }

            if(check){
                answer = x;
                break;
            }
            arr = tmp;
            x++;
        }

        return answer;
	} */
	
}
