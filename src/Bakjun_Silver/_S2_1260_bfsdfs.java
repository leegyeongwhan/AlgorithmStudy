package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _S2_1260_bfsdfs {
    static int[][] map;
    static boolean[] visit;
    static int N, M;
    static Deque<Integer> deque;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()) + 1;
        M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(start);
        System.out.println();
        visit = new boolean[N];
        deque = new LinkedList<>();

        bfs(start);
    }

    private static void bfs(int start) {
        deque.add(start);
        visit[start] = true;

        while (!deque.isEmpty()) {

            start = deque.poll();
            System.out.print(start + " ");

            for (int i = 0; i < N; i++) {
                if (map[start][i] == 1 && !visit[i]) {
                    deque.add(i);
                    visit[i] = true;
                }
            }
        }
    }

    private static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");

        for (int i = 0; i < N; i++) {
            if (map[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}
