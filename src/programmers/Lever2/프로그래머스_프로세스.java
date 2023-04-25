package programmers.Lever2;

import java.util.*;

public class 프로그래머스_프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            // 0 ,  //[2, 1, 3, 2]
            queue.add(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            boolean flag = false;
            int[] poll = queue.poll();
            Iterator<int[]> iterator = queue.iterator();
            while (iterator.hasNext()) {
                int[] next = iterator.next();
                if (next[1] > poll[1]) {
                    queue.add(poll);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                answer++;
                if (poll[0] == location) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        프로그래머스_프로세스 m = new 프로그래머스_프로세스();
        //    m.solution(new int[]{2, 1, 3, 2}, 2);
        m.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }
}
//2 1 3 2
// 0   1322
//  3221
//