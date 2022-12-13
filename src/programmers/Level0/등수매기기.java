package programmers.Level0;

import java.util.Arrays;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        Arrays.fill(answer, 1);
//[[1, 2], [1, 1], [1, 1]] -> [1, 2, 2]
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if ((score[i][0] + score[i][1]) < (score[j][0] + score[j][1])) {
                    answer[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        등수매기기 m = new 등수매기기();
        System.out.println(m.solution(new int[][]{{1, 2}, {1, 1}, {1, 1}}));
    }
}
