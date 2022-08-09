package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _S2_14889_스타트와링크 {
    static int[][] map;
    static boolean[] visit;
    static int num;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        num = Integer.parseInt(br.readLine());
        map = new int[num][num];
        //사람수
        visit = new boolean[num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // System.out.println(Arrays.deepToString(map));
        dfs(0, 0);
        System.out.println(MIN);
    }

    private static void dfs(int start, int depth) {
        if (depth == num / 2) {
            //비교
            /// System.out.println(Arrays.toString(visit));
            diff();
            return;
        }

        for (int i = start; i < num; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }

    private static void diff() {
        int start = 0;
        int link = 0;
        // 총 인원 전체탐색
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (visit[i] == true && visit[j] == true) {
                    start += map[i][j];
                    start += map[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    link += map[i][j];
                    link += map[j][i];
                }
            }
        }
        int res = Math.abs(start - link);
        if (res == 0) {
            System.out.println(res);
            System.exit(0);
        }
        MIN = Math.min(res, MIN);
    }
}
