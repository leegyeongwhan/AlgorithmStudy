package ProgrammersStudy.week1;

import java.util.ArrayList;
import java.util.List;

class English {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean check = true;
        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {   ///////중복된 단어가있다는 소리
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                check = false;
                break;
            }
            list.add(words[i]);
//그전단어의 끝과 현재 단어의 시작이 같은지
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                check = false;
                break;
            }
        }
        if (check) {
            answer[0] = 0;
            answer[1] = 0;
        } //다통과했다면 0, 0
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(solution(3, arr).toString());
    }
}
