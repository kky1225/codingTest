package level1.exam60_69;

import java.util.Arrays;

/*
 * 문제 이름 : 체육복
 * 문제 설명 : 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
 			예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
			전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 * 입출력 예 : 1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.
 * 입출력 예 : 3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42862
 * 
 * */
public class exam61 {

	// 내 풀이
	public int solution(int n, int[] lost, int[] reserve) {
		int cnt = n-lost.length;
        int reserve_arr[] = new int[reserve.length];
        int lost_arr[] = new int[lost.length];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int a=0;a<lost.length;a++){
            for(int b=0;b<reserve.length;b++){
                if(lost[a] == reserve[b]){
                    reserve_arr[b] = 1;
                    lost_arr[a] = 1;
                    cnt += 1;
                    break;
                }                   
            }
        }

        for(int a=0;a<lost.length;a++){
            for(int b=0;b<reserve.length;b++){
            int gap=Math.abs(lost[a]-reserve[b]);
	            if(gap == 1 && reserve_arr[b] == 0 && lost_arr[a] == 0 ){
	                cnt += 1;
	                lost_arr[a] = 1;
	                reserve_arr[b] = 1;
	                break; 
	            }               
            }
        }
        
        return cnt;
    }
	
	// 남의 풀이
	/* public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public int solution(int n, int[] lost, int[] reserve) {
	    int answer=n-lost.length;
        HashSet<Integer> ko = new HashSet<Integer>();
        for(int k : reserve) {
            ko.add(k);
        }
        for(int i =0;i<lost.length;i++) {
            if(ko.contains(lost[i])) {
                //System.out.println("내껀내가입지");
                answer++;
                ko.remove(lost[i]);
                lost[i]=-1;
            }
        }


        for(int i =0;i<lost.length;i++) {
            //System.out.println(i);

            if(ko.contains(lost[i]-1)) {
                //System.out.println("있다");
                answer++;
                ko.remove(lost[i]-1);
            }else if(ko.contains(lost[i]+1)) {
                //System.out.println("있다");
                answer++;
                ko.remove(lost[i]+1);
            }
            //System.out.println("없다");
        }


        return answer;
	} */
	
}
