package kakao._2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _레벨1신고결과받기 {
    /**
     * 신고자가 누구를 신고했는지
     * 내가 누구한테 신고 당했는지 구분하자.
     * 신고자가 누구를 신고했는지를 저장하는 memberMap
     * 신고당한사람이 몇번이나 신고 당했는지 저장하는 resultMap
     * resultMap.(신고된사람,시고한 사람들)
     *
     * @param id_list
     * @param report
     * @param k
     * @return
     */

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportMap = new HashMap();
        Map<String, Integer> memberMap = new HashMap();

        for (int i = 0; i < id_list.length; i++) {
            memberMap.put(id_list[i], i);
            reportMap.put(id_list[i], new HashSet<>());
        }

//        for (Map.Entry<String, Integer> entry : memberMap.entrySet()) {
//            System.out.println(entry);
//        }
//
//        for (Map.Entry<String, HashSet<String>> entry : reportMap.entrySet()) {
//            System.out.println(entry);
//        }

        for (String s : report) {
            String[] str = s.split(" ");
            String str1 = str[0];
            String str2 = str[1];
            reportMap.get(str2).add(str1);
        }

     //   System.out.println("report 후");
//        for (Map.Entry<String, HashSet<String>> entry : reportMap.entrySet()) {
//            System.out.println(entry);
//        }


        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> set = reportMap.get(id_list[i]);
            if (set.size() >= k) {
                for (String name : set) {
                //    System.out.println(memberMap.get(name));
                    answer[memberMap.get(name)]++;
                    //System.out.println("!!!" + Arrays.toString(answer));
                }
            }
        }
      //  System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        _레벨1신고결과받기 s = new _레벨1신고결과받기();

        System.out.println(Arrays.toString(s.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
    }
}
