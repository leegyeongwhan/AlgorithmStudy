package programmers.Lever2;

import java.util.*;
import java.util.stream.Stream;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] work = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int cnt = 0;
            while (true) {
                progresses[i] += speeds[i];
                cnt++;
                if (progresses[i] >= 100) {
                    break;
                }
            }
            work[i] = cnt;
        }
        //7 3 9
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < work.length; i++) {
            int cnt = 1;
            int origin = work[i];
            if (origin < 0) {
                continue;
            }
            for (int j = i + 1; j < work.length; j++) {
                int compare = work[j];
                if (origin >= compare) {
                    work[j] = -1;
                    cnt++;
                } else {
                    break;
                }
            }
            list.add(cnt);
        }
        System.out.println(list);
        work = list.stream().mapToInt(Integer::intValue)
                .toArray();
        return work;
    }

    public static void main(String[] args) {
        기능개발 m = new 기능개발();
        System.out.println(m.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }
}
