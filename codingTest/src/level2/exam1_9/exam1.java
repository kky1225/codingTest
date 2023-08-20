package level2.exam1_9;

/*
 * 문제 이름 : 최댓값과 최솟값
 * 문제 설명 : 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요. 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * 
 * */
public class exam1 {

	// 내 풀이
	public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : s.split(" ")) {
            int i = Integer.parseInt(str);
            
            if(i > max) {
                max = i;
            }
            
            if(min > i) {
                min = i;
            }
        }
        
        return min + " " + max;
    }
	
	// 남의 풀이
	/* public String solution(String s) {
        public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
                n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    } */

}
