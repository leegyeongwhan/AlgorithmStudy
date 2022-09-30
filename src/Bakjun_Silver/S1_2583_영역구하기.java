package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 1. 빈영역을 찾아야한다
 * 2. dfs로 찾자
 * 3. map , visit 방문여부 오름차순용 list
 */
public class S1_2583_영역구하기 {
    static int[][] map;
    static boolean[][] visit;
    static List<Integer> list;
    static int[] dirX = {-1, 0, 1, 0};
    static int[] dirY = {0, 1, 0, -1};
    static int M;
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visit = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    map[j][k] = 1;
                }
            }
        }

        list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && !visit[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        int nx = 0;
        int ny = 0;
        cnt++;

        for (int i = 0; i < 4; i++) {
            nx = x + dirX[i];
            ny = y + dirY[i];

            if (nx < 0 || ny < 0 || nx > M - 1 || ny > N - 1) {
                continue;
            }
            if (map[nx][ny] == 0 && !visit[nx][ny]) {
                visit[x][y] = true;
                dfs(nx, ny);
            }
        }
    }
}
