package programmers.Level1;

import java.util.Arrays;

public class 체육복 {
    // 1 3 5
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(reserve);
        Arrays.sort(lost);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        체육복 s = new 체육복();
        System.out.println(s.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }
}