package level2.exam40_49;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * 문제 이름 : 방문 길이
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/49994
 * */
public class exam41 {

	// 내 풀이
	public int solution(String dirs) {
        Set<Place> set = new HashSet<>();
        int prevX = 0;
        int prevY = 0;

        for(char dir : dirs.toCharArray()) {
            int nextX = prevX;
            int nextY = prevY;

            switch (dir) {
                case 'U':
                    nextY = prevY + 1;
                    break;
                case 'D':
                    nextY = prevY - 1;
                    break;
                case 'R':
                    nextX = prevX + 1;
                    break;
                case 'L':
                    nextX = prevX - 1;
                    break;
            }

            if(nextX < 6 && nextX > -6 && nextY < 6 && nextY > -6) {
                set.add(new Place(prevX, prevY, nextX, nextY));

                prevX = nextX;
                prevY = nextY;
            }
        }

        return set.size();
    }

    class Place {
        int prevX;
        int prevY;
        int nextX;
        int nextY;

        Place(int prevX, int prevY, int nextX, int nextY) {
            this.prevX = prevX;
            this.prevY = prevY;
            this.nextX = nextX;
            this.nextY = nextY;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this) return true;
            if(!(obj instanceof Place)) return false;
            Place place = (Place) obj;

            return (prevX == place.prevX && prevY == place.prevY && nextX == place.nextX && nextY == place.nextY)
                    || (prevX == place.nextX && prevY == place.nextY && nextX == place.prevX && nextY == place.prevY);
        }

        @Override
        public int hashCode() {
            return Objects.hash(prevX, prevY, nextX, nextY) + Objects.hash(nextX, nextY, prevX, prevY);
        }
    }
		
	
	// 남의 풀이
	/* public int solution(String dirs) {
        Map<String, int[]> map = new HashMap<>();
        map.put("U", new int[] {0, 1});
        map.put("D", new int[] {0, -1});
        map.put("R", new int[] {1, 0});
        map.put("L", new int[] {-1, 0});

        String[] arr = dirs.split("");

        Set<String> set = new HashSet<>();        
        int cx = 0;
        int cy = 0;

        for(int i=0; i<arr.length; i++) {
            String s = arr[i];

            int x = map.get(s)[0];
            int y = map.get(s)[1];

            cx += x;
            cy += y;

            if(cx < -5 || cx > 5) {
                cx -= x;
                continue;
            }
            if(cy < -5 || cy > 5) {
                cy -= y;
                continue;
            }
            set.add(""+(cx-x)+ ""+ (cy-y)+ ""+cx + ""+cy);
            set.add(""+cx + ""+cy+""+(cx-x)+ ""+ (cy-y));
        } 
        return set.size()/2;
    } */

}
