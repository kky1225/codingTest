package level1.exam50_59;

/*
 * 문제 이름 : 소수 만들기
 * 문제 설명 : 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
 * 입출력 예 : [1,2,3,4], 1
 * 입출력 예 : [1,2,7,6,4], 4
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12977
 * 
 * */
public class exam51 {

	// 내 풀이
	public int solution(int[] nums) {
		int answer = 0;

        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int count = 0;
                    
                    for(int l=2;l<sum;l++) {
                        if(sum % l == 0) {
                            count += 1;
                        }
                    }
                    
                    if(count == 0) {
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }
	
	// 남의 풀이
	/* public int solution(int[] nums) {
        int answer = 0;

        for (int a = 0; a < nums.length; a++) {
            for (int b = (a + 1); b <nums.length; b++) {
                for (int c = (b + 1); c < nums.length; c++) {
                    int sum = nums[a] + nums[b] + nums[c];
                    boolean confirm = true;
                    for (int i = 2; i < sum; i++) {
                        if (sum % i == 0) {
                            confirm = false;
                        }
                    }
                    if (confirm) answer++;
                }
            }
        }

        return answer;
    } */
	
}
