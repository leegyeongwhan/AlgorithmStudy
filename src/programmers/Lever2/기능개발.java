package programmers.Lever2;

import java.util.*;
import java.util.stream.Stream;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = 1;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }

    public static void main(String[] args) {
        기능개발 m = new 기능개발();
        System.out.println(m.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }
}
