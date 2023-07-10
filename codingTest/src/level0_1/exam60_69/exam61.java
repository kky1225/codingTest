package level0_1.exam60_69;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : 할 일 목록
 * 문제 설명 : 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때, todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * 입출력 예 : 예제 1번의 todo_list 중에서 "problemsolving"과 "swim"은 마쳤고, "practiceguitar"와 "studygraph"는 아직 마치지 못했으므로 todo_list에서 나온 순서대로 담은 문자열 배열 ["practiceguitar", "studygraph"]를 return 합니다.
 * 입출력 예 : 
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/181885
 * 
 * */
public class exam61 {

	// 내 풀이
	public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<todo_list.length;i++) {
            if(!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
	    return IntStream.range(0, finished.length).filter(i -> !finished[i]).mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
	} */
	
	// 남의 풀이
	/* public int[] solution(int[] num_list, int n) {
	    return IntStream.range(0, todoList.length)
            .mapToObj(i -> new AbstractMap.SimpleEntry<>(todoList[i], !finished[i]))
            .filter(AbstractMap.SimpleEntry::getValue)
            .map(AbstractMap.SimpleEntry::getKey)
            .toArray(String[]::new);
	} */
	
}
