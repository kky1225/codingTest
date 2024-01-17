package level2.exam40_49;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 이름 : [1차] 프렌즈4블록
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/17679
 * */
public class exam49 {

    static int answer = 0;

	// 내 풀이
    public int solution(int m, int n, String[] board) {
        while(true) {
            if(popBoard(board) == 0) {
                break;
            }

            dropBoard(board);
        }

        return answer;
    }

    public int popBoard(String[] board) {
        List<Integer[]> list = new ArrayList<>();

        for(int i=0;i<board.length-1;i++) {
            for(int j=0;j<board[i].length()-1;j++) {
                char sample = board[i].charAt(j);

                if(sample == '.') {
                    continue;
                }

                if(sample == board[i].charAt(j + 1) && sample == board[i + 1].charAt(j) && sample == board[i + 1].charAt(j + 1)) {
                    list.add(new Integer[]{i, j});
                }
            }
        }

        if(list.isEmpty()) {
            return 0;
        }

        for(Integer[] arr : list) {
            for(int n=0;n<2;n++) {
                StringBuilder sb = new StringBuilder();

                for(int i=0;i<board[arr[0] + n].length();i++) {
                    if(i == arr[1] || i == arr[1] + 1) {
                        sb.append(".");

                        if(board[arr[0] + n].charAt(i) != '.') {
                            answer++;
                        }
                    }else {
                        sb.append(board[arr[0] + n].charAt(i));
                    }
                }

                board[arr[0] + n] = sb.toString();
            }
        }

        return 1;
    }

    public void dropBoard(String[] board) {
        for(int n=0;n<board.length-1;n++) {
            for(int i=board.length-1;i>0;i--) {
                StringBuilder overBoard = new StringBuilder();
                StringBuilder underBoard = new StringBuilder();

                for(int j=0;j<board[i].length();j++) {
                    if(board[i].charAt(j) == '.') {
                        overBoard.append(".");
                        underBoard.append(board[i - 1].charAt(j));
                    }else {
                        overBoard.append(board[i - 1].charAt(j));
                        underBoard.append(board[i].charAt(j));
                    }
                }

                board[i] = underBoard.toString();
                board[i - 1] = overBoard.toString();
            }
        }
    }

}
