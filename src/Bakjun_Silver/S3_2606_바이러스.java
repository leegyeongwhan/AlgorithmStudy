package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_2606_바이러스 {
    static int[][] map;
    static boolean visit[];
    static int N;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        map = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    map[a][b] = 1;
                    map[b][a] = 1;
                }
            }
        }
        dfs(1);
        System.out.println(result);
    }

    private static void dfs(int index) {
        visit[index] = true;

        for (int i = 1; i <= N; i++) {
            if (map[index][i] == 1 && !visit[i]) {
                result++;
                dfs(i);
            }
        }
        return;
    }
}
