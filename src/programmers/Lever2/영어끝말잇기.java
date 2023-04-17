package programmers.Lever2;

import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        String[][] map = new String[n][words.length / n];
// tank kick know wheel land dream
//1번 사람 : tank, wheel, mother
//2번 사람 : kick, land, robot
//3번 사람 : know, dream, tank
        Set<String> set = new HashSet<>();
        String last = "";
        String front = "";
        set.add(words[0]);
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for (int i = 1; i < words.length; i++) {
            if (set.contains(words[i])) {
                break;
            }
            last = String.valueOf(words[i - 1].charAt(words[i - 1].length() - 1));
            front = String.valueOf(words[i].charAt(0));
            if (front.equals(last)) {
                cnt++;
                set.add(words[i]);
            } else {
                break;
            }
        }
        int a = cnt / n + 1;
        int b = cnt % n + 1;
        System.out.println("a = " + a);
        System.out.println("a = " + b);
        if (cnt == words.length) {
            answer = new int[]{0, 0};
        } else {
            answer = new int[]{b, a};
        }
        return answer;
    }

    public static void main(String[] args) {
        영어끝말잇기 m = new 영어끝말잇기();
        System.out.println(m.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
    }
}
