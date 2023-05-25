package level1.exam50_59;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 모의고사
 * 문제 설명 : 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
			1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
			2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
			3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
			1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * 입출력 예 : [1,2,3,4,5], [1]
 * 입출력 예 : [1,3,2,4,2], [1,2,3]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 
 * */
public class exam50 {

	// 내 풀이
	public int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        
        for(int i=0;i<answers.length;i++) {
            while(i < answers.length) {
                if(index1 > pattern1.length - 1) {
                    index1 = 0;
                }
                
                if(pattern1[index1] == answers[i]) {
                    answer1 += 1;
                }
                
                if(index2 > pattern2.length - 1) {
                    index2 = 0;
                }
                
                if(pattern2[index2] == answers[i]) {
                    answer2 += 1;
                }
                
                if(index3 > pattern3.length - 1) {
                    index3 = 0;
                }
                
                if(pattern3[index3] == answers[i]) {
                    answer3 += 1;
                }
                
                index1 += 1;
                index2 += 1;
                index3 += 1;
                i += 1;
            }
        }
        
        int[] temp = {answer1, answer2, answer3};
        
        int max = -1;

        if(answer1 > max) {
            max = answer1;
        }
        
        if(answer2 > max) {
            max = answer2;
        }
        
        if(answer3 > max) {
            max = answer3;
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i=0;i<temp.length;i++) {
            if(max == temp[i]) {
                answerList.add(i + 1);
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0;i<answerList.size();i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] answers) {
	    int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
	} */
	
}
