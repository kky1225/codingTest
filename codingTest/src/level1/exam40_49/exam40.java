package level1.exam40_49;

/*
 * 문제 이름 : 문자열 내 마음대로 정렬하기
 * 문제 설명 : 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 * 입출력 예 : "sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.
 * 입출력 예 : "abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. "abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * 
 * */
public class exam40 {

	// 내 풀이
	public String[] solution(String[] strings, int n) {
		for(int i=0;i<strings.length-1;i++) {
			for(int j=i+1;j<strings.length;j++) {
				if(strings[i].charAt(n) > strings[j].charAt(n)) {
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}else if(strings[i].charAt(n) == strings[j].charAt(n)) {
					if(strings[i].compareTo(strings[j]) > 0){ 
	                     String tmp = strings[i];
	                     strings[i]= strings[j];
	                     strings[j]=tmp;
	                 }
				}
			}
		}
		
        return strings;
    }
	
	// 남의 풀이
	/* public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    } */
	
	// 남의 풀이
	/* public String[] solution(String[] strings, int n) {
	    int l = strings.length;
        for(int i=0;i<l;i+=1){
            strings[i] = strings[i].substring(n,n+1)+strings[i];
        }
        Arrays.sort(strings);
        for(int i=0;i<l;i+=1){
            strings[i] = strings[i].substring(1);
        }
        return strings;
	} */
	
}
