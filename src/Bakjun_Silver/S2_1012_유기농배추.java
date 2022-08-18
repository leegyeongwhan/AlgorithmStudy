package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//4방향
public class S2_1012_유기농배추 {
    /*
    1.방문여부를 체크해야한다. 2. 상하좌우 방향을 생각한다
     */
    static int[][] map;
    static boolean[][] visit;
    static int N;
    static int M;
    //                    12  3   6  9
    static int[] dir4row = {1, 0, -1, 0};
    static int[] dir4cal = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visit = new boolean[N][M];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            //배추가 있고 방문하지 않았다면
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] == 1 && !visit[j][k]) {
                        dfs(j, k);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    private static void dfs(int row, int cal) {
        visit[row][cal] = true;
        //배추가있을때 들어오고 4방향을 탐색한다
        //map에 벗어나는지를 체크한다
        for (int i = 0; i < 4; i++) {
            int nrow = row + dir4row[i];
            int ncal = cal + dir4cal[i];
            if (nrow < 0 || ncal < 0 || nrow > N - 1 || ncal > M - 1) {
                continue;
            }
            if (!visit[nrow][ncal] && map[nrow][ncal] == 1) {
                dfs(nrow, ncal);
            }
        }
    }
}
