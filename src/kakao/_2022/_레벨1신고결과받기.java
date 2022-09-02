package kakao._2022;

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
        int[] answer = {};
        Map<String, HashSet<String>> reportMap = new HashMap();
        Map<String, Integer> memberMap = new HashMap();

        for (int i = 0; i < id_list.length; i++) {
            memberMap.put(id_list[i], i);
            reportMap.put(id_list[i], new HashSet<>());
        }

        for (int i = 0; i < report.length; i++) {
            String[] arr = report[i].split(" ");
            String str1 = arr[0];
            String str2 = arr[2];
            reportMap.get(str1).add(str2);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> set = reportMap.get(id_list[i]);
            if (set.size() >= 2) {
                for (String name : set) {
                    answer[memberMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}
