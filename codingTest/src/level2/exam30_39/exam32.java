package level2.exam30_39;

import java.util.Arrays;

/*
 * 문제 이름 : 전화번호 목록
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * */
public class exam32 {

	// 내 풀이
	public boolean solution(String[] phone_book) {
		    Arrays.sort(phone_book);
		    
		    for(int i=0;i<phone_book.length-1;i++) {
		        if(phone_book[i + 1].startsWith(phone_book[i])) {
		            return false;
		        }
		    }
		    
		    return true;
		}
		
	
	// 남의 풀이
	/* public boolean solution(String[] phoneBook) {
		    Arrays.sort(phoneBook);
		    boolean result = true;
		    for (int i=0; i<phoneBook.length-1; i++) {
		        if (phoneBook[i+1].contains(phoneBook[i])) {
		            result = false;
		            break;
		        }
		    }
		    return result;
		} */

}
