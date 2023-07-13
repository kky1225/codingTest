package level0_1.exam80_89;

/*
 * 문제 이름 : 날짜 비교하기
 * 문제 설명 : 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다. 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181838
 * 
 * */
public class exam80 {

	// 내 풀이
	public int solution(int[] date1, int[] date2) {
        if(date1[0] > date2[0]) {
            return 0;
        }
        
        if(date1[0] == date2[0] && date1[1] > date2[1]) {
            return 0;
        }
        
        if(date1[0] == date2[0] && date1[1] == date2[1] && date1[2] >= date2[2]) {
            return 0;
        }
        
        return 1;
    }
	
	// 남의 풀이
	/* public int solution(int a, int d, boolean[] included) {
	    LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateA.isBefore(dateB)) {
            return 1;
        } else {
            return 0;
        }
	} */
	
	// 남의 풀이
	/* public int solution(int a, int d, boolean[] included) {
	    return Arrays.compare(date1, date2) < 0 ? 1 : 0;
	} */
	
}
