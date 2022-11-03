package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_2469_안전영역 {
    static int[][] map;
    static int[][] cloneMap;
    static boolean[][] visit;
    static int[] dirX = {1, 0, -1, 0};
    static int[] dirY = {0, 1, 0, -1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        int max = 0;
        int cntMax = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
            }
        }

        for (int k = 0; k <= max; k++) {
            cloneMap = new int[n][n];
            visit = new boolean[n][n];
            int cnt = 0;

            for (int i = 0; i < n; i++) { ///최대 높이를 구한 후 작은 높이 부터 반복한다 반복하는 높이  보다 작은 높이는 0 높은건 1
                for (int j = 0; j < n; j++) {
                    if (map[i][j] <= k) {
                        cloneMap[i][j] = 0;
                    } else {
                        cloneMap[i][j] = 1;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visit[i][j] && cloneMap[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            cntMax = Math.max(cntMax, cnt);
        }
        System.out.println(cntMax);
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];

            if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) {
                continue;
            }

            if (!visit[nx][ny] && cloneMap[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
        return;
    }
}
