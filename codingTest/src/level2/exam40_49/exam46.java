package level2.exam40_49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 문제 이름 : 오픈채팅방
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/42888
 * */
public class exam46 {

	// 내 풀이
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();

        for(String info : record) {
            String[] infoArr = info.split(" ");

            if(infoArr.length > 2) {
                map.put(infoArr[1], infoArr[2]);
            }
        }

        return changeLog(record, map);
    }

    public String[] changeLog(String[] record, Map<String, String> map) {
        List<String> list = new ArrayList<>();

        for(String info : record) {
            String[] infoArr = info.split(" ");

            switch (infoArr[0]) {
                case "Enter":
                    list.add(map.get(infoArr[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    list.add(map.get(infoArr[1]) + "님이 나갔습니다.");
                    break;
            }
        }

        return list.toArray(new String[list.size()]);
    }
		
	
	// 남의 풀이
	/* private static final String ENTER_FORMAT = "%s님이 들어왔습니다.";
    private static final String LEAVE_FORMAT = "%s님이 나갔습니다.";

    private HashMap<String, UserInfo> userMap = new HashMap<>();

    private class UserInfo {
        public String userId;
        public String nickName;

        public UserInfo(String userId, String nickName) {
            this.userId = userId;
            this.nickName = nickName;
        }

    }

    private class Command {
        public char command;
        public String userId;

        public Command(char command, String userName) {
            this.command = command;
            this.userId = userName;
        }
    }


    public String[] solution(String[] records) {
        ArrayList<Command> commandList = new ArrayList<>();

        for (String record : records) {
            String[] split = record.split(" ");
            String command = split[0];
            String userId = split[1];
            String nickName = null;

            switch(command.charAt(0)) {
                case 'E': // Enter
                    nickName = split[2];
                    if(userMap.containsKey(userId) == false) {
                        userMap.put(userId, new UserInfo(userId, nickName));
                    } else {
                        userMap.get(userId).nickName = nickName;
                    }

                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'L': // Leave
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'C': // Change
                    nickName = split[2];
                    userMap.get(userId).nickName = nickName;
                    break;
            }
        }

        return commandList.stream()
                .map(cmd -> String.format( cmd.command == 'E' ? ENTER_FORMAT : LEAVE_FORMAT , userMap.get(cmd.userId).nickName))
                .toArray(ary -> new String[commandList.size()]);
    } */

}
