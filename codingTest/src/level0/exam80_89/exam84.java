package level0.exam80_89;

/*
 * 문제 이름 : 로그인 성공?
 * 문제 설명 : 머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요. 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다. 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
 * 입출력 예 : db에 같은 정보의 계정이 있으므로 "login"을 return합니다.
 * 입출력 예 : db에 아이디는 같지만 패스워드가 다른 계정이 있으므로 "wrong pw"를 return합니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/120883
 * 
 * */
public class exam84 {

	// 내 풀이
	public String solution(String[] id_pw, String[][] db) {
		String answer = "";
		
		for(int i=0; i<db.length; i++) {
			if(id_pw[0].equals(db[i][0])) {
				if(id_pw[1].equals(db[i][1])) {
					answer = "login";
                    break;
				}else {
					answer = "wrong pw";
                    break;
				}
			}else {
				answer = "fail";
			}
		}
		
        return answer;
	}
	
	// 남의 풀이
	/* public String solution(String[] idPw, String[][] db) {
        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    } */
	
}
