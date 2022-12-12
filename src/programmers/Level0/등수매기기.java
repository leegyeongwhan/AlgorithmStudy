package programmers.Level0;

import java.util.Arrays;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        Arrays.fill(answer, 1);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if ((score[i][0] + score[i][1]) / 2 < (score[j][0] + score[j][1]) / 2) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
