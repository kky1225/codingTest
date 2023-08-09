package level0_1.exam100_125;

/*
 * 문제 이름 : 그림 확대
 * 문제 설명 : 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181836
 * 
 * */
public class exam115 {

	// 내 풀이
	public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        
        for(int i=0;i<picture.length;i++) {
            StringBuilder sb = new StringBuilder();
            
            for(char c : picture[i].toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            
            for(int a=0;a<k;a++) {
                answer[index + a] = sb.toString();
            }
            
            index += k;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public String[] solution(String[] picture, int k) {
	    StringBuffer sb1 = new StringBuffer(), sb2 = new StringBuffer();;
        String dot = "", x = "";
        for (int i = 0;i < k;i++) {
            sb1.append(".");
            sb2.append("x");
        }
        dot = sb1.toString();
        x = sb2.toString();

        int idx = 0;
        String[] answer = new String[picture.length * k];
        for (int i = 0;i < picture.length;i++)    {
            String result = picture[i].replace(".", dot);
            result = result.replace("x", x);

            for (int j = 0;j < k;j++)
                answer[idx++] = result;
        }
        return answer;
	} */
	
}
