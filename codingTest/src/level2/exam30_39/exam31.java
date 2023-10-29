package level2.exam30_39;

/*
 * 문제 이름 : 타겟 넘버
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/43165
 * */
public class exam31 {

	// 내 풀이
	public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int[] numbers, int target, int sum, int count) {
        int answer = 0;
        
        if(count == numbers.length) {
            if(sum == target) {
                return 1;
            }
            
            return 0;
        }
        
        answer += dfs(numbers, target, sum + numbers[count], count + 1);
        answer += dfs(numbers, target, sum - numbers[count], count + 1);
        
        return answer;
    }
    
	
	// 남의 풀이
	/* public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    } */

}
