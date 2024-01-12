package level2.exam40_49;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 문제 이름 : [3차] 파일명 정렬
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17686
 * */
public class exam48 {

	// 내 풀이
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = getHead(o1);
                String head2 = getHead(o2);

                int number1 = Integer.parseInt(getNumber(o1.replace(head1, "")));
                int number2 = Integer.parseInt(getNumber(o2.replace(head2, "")));

                if(head1.equalsIgnoreCase(head2)) {
                    return Integer.compare(number1, number2);
                }

                return head1.compareTo(head2);
            }
        });

        return files;
    }

    public String getHead(String fileName) {
        StringBuilder sb = new StringBuilder();

        for(char fileChar : fileName.toCharArray()) {
            if(Character.isDigit(fileChar)) {
                break;
            }
            sb.append(fileChar);
        }

        return sb.toString();
    }

    public String getNumber(String fileName) {
        StringBuilder sb = new StringBuilder();

        for(char fileChar : fileName.toCharArray()) {
            if(Character.isDigit(fileChar) && sb.length() < 5) {
                sb.append(fileChar);
            }else {
                break;
            }
        }

        return sb.toString();
    }

	// 남의 풀이
	/* public String[] solution(String[] files) {
        Pattern p = Pattern.compile("([a-z\\s.-]+)([0-9]{1,5})");

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                Matcher m1 = p.matcher(s1.toLowerCase());
                Matcher m2 = p.matcher(s2.toLowerCase());
                m1.find();
                m2.find();

                if(!m1.group(1).equals(m2.group(1))) {
                    return m1.group(1).compareTo(m2.group(1));
                } else {
                    return Integer.parseInt(m1.group(2)) - Integer.parseInt(m2.group(2));
                }
            }
        });

        return files;
    } */

}
