package level0.exam90_99;

/*
 * 문제 이름 : 분수의 덧셈
 * 문제 설명 : 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력 예 : 1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
 * 입출력 예 : 9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * 
 * */
public class exam94 {

	// 내 풀이
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int[] answer = new int[2];
       int molecule = numer1 * denom2 + numer2 * denom1;
       int denominator = denom1 * denom2;
       int i = 2;

       while(denominator >= i){
          if(molecule % i == 0 && denominator % i ==0){
             molecule /= i;
             denominator /= i;
          }else {
             i++;
          }
       }

       answer[0] = molecule;
       answer[1] = denominator;

       return answer;
    }
	
    // 남의 풀이
	/* public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

        answer[0]=denum1*num2+denum2*num1;
        answer[1]=num1*num2;
        int min = Math.min(answer[0],answer[1]);
        int max = 1;
        for(int i=1; i<=min; i++){
            if(answer[0]%i==0 && answer[1]%i==0){
                max= i;
            }
        }
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    } */

	// 남의 풀이
	/* public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int[] answer = {denum1, num1, denum2, num2};
        // denum = 분자
        // num = 분모
        int denum = denum1*num2 + denum2*num1;
        int num = num1 * num2;

        int mod = gcd(denum, num);
            denum /= mod;
            num /= mod;

        int[] result = {denum, num};

        return result;
    }

    // 유클리드 호제법
    public int gcd(int a, int b){
        // a가 b보다 크다면 실행.
        if (a <= b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    } */
	
}
