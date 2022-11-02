package codesquad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.단어는 한번밖에 못말한다
 * 2.말할수 없는 단어를 체크한다
 * 3. 말할수 잇는 단어를 뺀다.
 */
public class 옹알이 {
    public int solution(String[] babbling) {
        String[] bad = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] good = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            String tmp = babbling[i];
            for (int j = 0; j < 4; j++) {
                tmp = tmp.replaceAll(bad[j], "x");
            }
            for (int j = 0; j < 4; j++) {
                tmp = tmp.replaceAll(good[j], "?");

            }
            int cnt2 = 0;
            for (int j = 0; j < tmp.length(); j++) {
                if (tmp.charAt(j) != '?') {
                    cnt2++;
                } else {
                    tmp = tmp.replace("?", "");
                }
            }
            if (cnt2 == 0 && tmp.length() == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        옹알이 s = new 옹알이();
        System.out.println(s.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}
