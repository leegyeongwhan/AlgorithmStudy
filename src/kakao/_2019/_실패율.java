package kakao._2019;

import Bakjun.A;

import java.util.Arrays;
import java.util.Collections;

public class _실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N + 1];
        int len = stages.length;

        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (i == stages[j]) {
                    stages[j] = 0;
                    //실패한 사람수
                    System.out.println("i" + i);
                    System.out.println(Arrays.toString(stages));
                    System.out.println();
                    cnt++;
                }
            }
            float fail = cnt / len;
            len -= cnt;
            answer[i] = i;
            System.out.println(Arrays.toString(answer));
        }

        Integer[] arr2 = Arrays.stream(answer).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        int b[] = Arrays.stream(arr2).mapToInt(Integer::intValue).toArray();
        return b;
    }

    public static void main(String[] args) {
        _실패율 a = new _실패율();
        System.out.println(Arrays.toString(a.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }
}
