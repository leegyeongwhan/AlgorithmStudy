package programmers.Lever2;


import java.util.*;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> log = new ArrayList<>();

        //루프를 돌며 record 에 저장된 최종 아이디와 그의 key값을 저장
        for (String s : record) {
            String[] split = s.split(" ");
            String active = split[0];
            String id = split[1];

            if (active.equals("Leave")) {
                continue;
            }
            String name = split[2];

            if (active.equals("Enter")) {
                map.put(id, name);
            } else if (active.equals("Change")) {
                map.put(id, name);
            }
        }

        //결국은 id값을 주기 때문에 id 에 해당하는 닉네임만 뽑는다.
        for (String s : record) {
            String[] split = s.split(" ");
            String active = split[0];
            String id = split[1];
            String name = map.get(id);

            if (active.equals("Enter")) {
                log.add(name + "님이 들어왔습니다.");
            } else if (active.equals("Leave")) {
                log.add(name + "님이 나갔습니다.");
            }
        }

        String[] answer = log.stream()
                .map(String::valueOf)
                .toArray(String[]::new);
        return answer;
    }

    public static void main(String[] args) {
        오픈채팅방 m = new 오픈채팅방();
        System.out.println(m.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"}));
    }
}
