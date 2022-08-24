package ProgrammersStudy.Level2;

import java.util.HashMap;
import java.util.Map;

public class _레벨2_완주하지못선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        int i = 1;
        for (String s : participant) {
            participantMap.put(s, participantMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            participantMap.put(s, participantMap.get(s) - 1);
        }


        //차이가 하나니까 participant맵에서 completion맵의 벨류값을 빼주면 남은 사람은 한명
        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) != 0) {
                answer = s;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _레벨2_완주하지못선수 s = new _레벨2_완주하지못선수();
        String[] str1 = {"leo", "kiki", "eden"};
        String[] str2 = {"eden", "kiki"};
        s.solution(str1, str2);
    }
}
