package level1.exam40_49;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 문제 이름 : 2016년
 * 문제 설명 : 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 * 입출력 예 : 5, 24, "TUE"
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12901
 * 
 * */
public class exam48 {

	// 내 풀이
	public String solution(int a, int b) throws ParseException {
		String answer = "";
		if(10 > a) {
			answer = "2016-0" + a + "-" + b;
		}else {
			answer = "2016-" + a + "-" + b;
		}
		
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(answer);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        int day = cal.get(Calendar.DAY_OF_WEEK);
        
        switch (day) {
			case 1: {
				answer = "SUN";
				break;
			}case 2: {
				answer = "MON";
				break;
			}case 3: {
				answer = "TUE";
				break;
			}case 4: {
				answer = "WED";
				break;
			}case 5: {
				answer = "THU";
				break;
			}case 6: {
				answer = "FRI";
				break;
			}case 7: {
				answer = "SAT";
				break;
			}
		}
        
        return answer;
    }
	
	// 남의 풀이
	/* public String solution(int a, int b) {
         Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
                        .setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    } */
	
	// 남의 풀이
	/* public String solution(int a, int b) {
	    String answer = "";

      int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
      String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
      int Adate = 0;
      for(int i = 0 ; i< a-1; i++){
          Adate += c[i];
      }
      Adate += b-1;
      answer = MM[Adate %7];

      return answer;
	} */
	
}
