package level2.exam40_49;

/*
 * 문제 이름 : 스킬트리
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/49993
 * */
public class exam45 {

	// 내 풀이
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skill_tree : skill_trees) {
            if(checkSkillTree(skill, skill_tree)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean checkSkillTree(String skill, String skill_tree) {
        int index = 0;

        for(char c : skill_tree.toCharArray()) {
            if(skill.contains(String.valueOf(c))) {
                if(skill.charAt(index) == c) {
                    index++;
                }else {
                    return false;
                }
            }
        }

        return true;
    }
		
	
	// 남의 풀이
	/* public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    } */

}
