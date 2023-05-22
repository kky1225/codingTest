package level1.exam40_49;

/*
 * 문제 이름 : 추억 점수
 * 문제 설명 : 사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다. 예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가 [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다. 
 * 			다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 ["kali", "mari", "don"]의 그리움 점수가 각각 [11점, 1점, 55점]]이고, "tony"는 그리움 점수가 없을 때, 이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.
			그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.
 * 입출력 예 : ["may", "kein", "kain", "radi"],	[5, 10, 1, 3],	[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]],	[19, 15, 6]
 * 입출력 예 : ["kali", "mari", "don"],	[11, 1, 55],	[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]],	[67, 0, 55]
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/176963
 * 
 * */
public class exam47 {

	// 내 풀이
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0;i<photo.length;i++) {
            int score = 0;
            for(int j=0;j<photo[i].length;j++) {
                for(int k=0;k<name.length;k++) {
                    if(photo[i][j].equals(name[k])) {
                        score += yearning[k];
                    }
                }
            }
            
            answer[i] = score;
        }
        
        return answer;
    }
	
	// 남의 풀이
	/* public int[] solution(String[] name, int[] yearning, String[][] photo) {
         Map<String, Integer> map = IntStream.range(0, name.length).mapToObj(operand -> Map.entry(name[operand], yearning[operand])).collect(Collectors.toSet()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
    } */
	
	// 남의 풀이
	/* public int[] solution(String[] name, int[] yearning, String[][] photo) {
	    int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i< name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i =0; i< photo.length;i++){
            String[] persons = photo[i];
            int score = 0;
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){
                    score+=map.get(person);
                }
            }
            answer[i]=score;
        }

        return answer;
	} */
	
}
