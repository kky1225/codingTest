package level1.exam50_59;

/*
 * 문제 이름 : 로또의 최고 순위와 최저 순위
 * 문제 설명 : 로또 6/45(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 아래는 로또의 순위를 정하는 방식입니다.
			순위	당첨 내용
			1	6개 번호가 모두 일치
			2	5개 번호가 일치
			3	4개 번호가 일치
			4	3개 번호가 일치
			5	2개 번호가 일치
			6(낙첨)	그 외
			로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
			알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.
			민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
			lottos	win_nums	result
 * 입출력 예 : [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
 * 입출력 예 : [0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/77484
 * 
 * */
public class exam59 {

	// 내 풀이
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        
        for(int i=0;i<win_nums.length;i++) {
            for(int j=0;j<lottos.length;j++) {
                if(win_nums[i] == lottos[j]) {
                    count++;
                }
            }
        }
        
        answer[1] = rank(count, 0);
        
        int remove = 0;
        
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i] == 0) {
                remove++;
            }
        }
        
        answer[0] = rank(count, remove);
        
        return answer;
    }
    
    public int rank(int count, int remove) {
		switch (count + remove) {
            case 0 : {
				return 6;
			}case 1 : {
	        	return 6;
	        }case 2 : {
	        	return 5;
			}case 3 : {
				return 4;
			}case 4 : {
				return 3;
			}case 5 : {
				return 2;
			}case 6 : {
				return 1;
			}default : {
				return 1;
			}
		}
	}
	
	// 남의 풀이
	/* public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    } */
	
	// 남의 풀이
	/* public int[] solution(int[] lottos, int[] win_nums) {
	     return LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count()
        )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
	} */
	
}
