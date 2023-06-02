package level1.exam50_59;

/*
 * 문제 이름 : [1차] 다트 게임
 * 문제 설명 : 카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
 * 입출력 예 : ["i", "drink", "water"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"Yes" 갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 다트 게임의 점수 계산 로직은 아래와 같다.
			1. 다트 게임은 총 3번의 기회로 구성된다.
			2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
			3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
			4. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
			5. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
			6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
			7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
			8. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
			9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
			0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
 * 입출력 예 : dartResult	answer	설명
			1S2D*3T		37		11 * 2 + 22 * 2 + 33
			1D2S#10S	9		12 + 21 * (-1) + 101
			1D2S0T		3		12 + 21 + 03
			1S*2T*3S	23		11 * 2 * 2 + 23 * 2 + 31
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17682
 * 
 * */
public class exam56 {

	// 내 풀이
	public int solution(String dartResult) {
		int length = dartResult.length();
        int[] number = new int[3];
        int count = 0;
        int num = 0;
        String a = "";
        
        while(count<length){
            if(dartResult.charAt(count) != 'S' && dartResult.charAt(count) != 'D' && dartResult.charAt(count) != 'T' && dartResult.charAt(count) != '#' && dartResult.charAt(count) != '*'){
                a += dartResult.charAt(count);
            }else{
                if(dartResult.charAt(count)=='S'){
                    number[num] = (int) Math.pow(Integer.parseInt(a), 1);
                    a = "";
                    num++;
                }
                else if(dartResult.charAt(count)=='D'){
                    number[num] = (int) Math.pow(Integer.parseInt(a), 2);
                    a = "";
                    num++;  
                }
                else if(dartResult.charAt(count)=='T'){
                    number[num] = (int) Math.pow(Integer.parseInt(a), 3);
                    a = "";
                    num++;  
                }
                else if(dartResult.charAt(count)=='*'){
                    number[num-1]*=2;
                    if(num-2>=0){
                        number[num-2]*=2;
                    }
                }
                else if(dartResult.charAt(count)=='#'){
                    number[num-1]*=-1;
                }
            }           
            count++;
        }

        return(number[0]+number[1]+number[2]);
    }
	
	// 남의 풀이
	/* public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < dartResult.length(); ++i) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                sum = (c - '0');
                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    sum = 10;
                    i++;
                }
                stack.push(sum);
            } else {
                int prev = stack.pop();
                if (c == 'D') {
                    prev *= prev;
                } else if (c == 'T') {
                    prev = prev * prev * prev;
                } else if (c == '*') {
                    if (!stack.isEmpty()) {
                        int val = stack.pop() * 2;
                        stack.push(val);
                    }
                    prev *= 2;
                } else if (c == '#') {
                    prev *= (-1);
                }
                // System.out.println(prev);
                stack.push(prev);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }
        return totalScore;
    } */
	
}
