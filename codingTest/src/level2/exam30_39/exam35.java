package level2.exam30_39;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : [3차] 압축
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17684
 * */
public class exam35 {

	// 내 풀이
	public int[] solution(String msg) {
        List<String> dictionary = addDictionary();
        List<Integer> index = new ArrayList<>();
        
        for(int i=0;i<msg.length();i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(i));
            
            while(i < msg.length() - 1) {
                String nextWord = String.valueOf(msg.charAt(i + 1));
                
                if(dictionary.contains(sb.toString() + nextWord)) {
                    sb.append(nextWord);
                    
                    i += 1;
                }else {
                    index.add(dictionary.indexOf(sb.toString()) + 1);
                    
                    sb.append(nextWord);
                    dictionary.add(sb.toString());
                    
                    break;
                }
                
            }
            
            if(i == msg.length() - 1) {
                index.add(dictionary.indexOf(sb.toString()) + 1);
                break;
            }
        }
        
        return index.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    public List<String> addDictionary() {
        List<String> list = new ArrayList<>();
        
        for(int i=65;i<91;i++) {
            list.add(String.valueOf((char) i));
        }
        
        return list;
    }
		
	
	// 남의 풀이
	/* public int[] solution(String msg) {
    ArrayList<String> dic = new ArrayList<String>();
    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int i = 0 ; i < 26; i++) {
        dic.add(String.valueOf((char)('A'+i)));
    }

    for(int i = 0 ; i < msg.length() ; i++) {
        for(int j = dic.size()-1 ; j >= 0 ; j--) {
            if(msg.substring(i).startsWith(dic.get(j))) {
                i += dic.get(j).length()-1;
                result.add(j+1);
                if(i+1 < msg.length())
                    dic.add(dic.get(j)+msg.charAt(i+1));
                break;
            }
        }
    }

    int[] answer = new int[result.size()];

    for(int i = 0 ; i < result.size() ; i++) 
        answer[i] = result.get(i);

    return answer;  
  } */

}
