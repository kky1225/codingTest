package level1.exam60_69;

/*
 * 문제 이름 : 숫자 짝꿍
 * 문제 설명 : 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
			예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
			두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
			X	Y	result
 * 입출력 예 : "100"	"2345"	"-1"
 * 입출력 예 : "100"	"203045"	"0"
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/77484
 * 
 * */
public class exam60 {

	// 내 풀이
	public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        
        for(int i=0; i<X.length();i++){
             x[X.charAt(i) - 48] += 1;
        }
        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i) - 48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
           return "-1";
        }
        
        if(answer.toString().charAt(0)==48){
           return "0";
        }
            
        return answer.toString();
    }
	
	// 남의 풀이
	/* public String solution(String X, String Y) {
        Map<Character, Integer> mapX = new HashMap<>();
        Map<Character, Integer> mapY = new HashMap<>();

        int lx = X.length();
        int ly = Y.length();
        for (int i = 0; i < Math.max(lx, ly); i++) {
            if (i < lx) {
                char c1 = X.charAt(i);
                mapX.put(c1, mapX.getOrDefault(c1, 0) + 1);
            }

            if (i < ly) {
                char c2 = Y.charAt(i);
                mapY.put(c2, mapY.getOrDefault(c2, 0) + 1);
            }
        }

        List<Character> list = new ArrayList<>();

        for (Character c : mapX.keySet()) {
            for (int j = 0; j < Math.min(mapX.getOrDefault(c, 0), mapY.getOrDefault(c, 0)); j++) {
                list.add(c);
            }
        }

        if (list.size() == 0) {
            return "-1";
        }

        list.sort(Collections.reverseOrder());

        if (list.get(0) == '0') {
            return "0";
        }

        StringBuilder result = new StringBuilder(list.size());
        for (Character s : list) {
            result.append(s);
        }

        return result.toString();
    } */
	
	// 남의 풀이
	/* public String solution(String X, String Y) {
	    int[] arrX = new int[10];
        int[] arrY = new int[10];
        X.chars().mapToObj(c->(char)c).mapToInt(c->Character.digit(c,10)).forEach(a->arrX[a]++);
        Y.chars().mapToObj(c->(char)c).mapToInt(c->Character.digit(c,10)).forEach(a->arrY[a]++);
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            sb.append(String.valueOf(i).repeat(Math.max(0, Math.min(arrX[i], arrY[i]))));
        }

        if(sb.length()==0){
            return "-1";
        }
        if(sb.charAt(0)=='0'){
            return "0";
        }
        return sb.toString();
	} */
	
}
