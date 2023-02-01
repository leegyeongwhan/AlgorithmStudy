package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S4_9372_상근이의여행 {
    static int n, m, result;
    static int[][] map;
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //노드간선의 수는 노드의수의 01
        int t = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            visit = new boolean[n];
            map = new int[n][n];
            result = 0;

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int contryA = Integer.parseInt(st.nextToken());
                int contryB = Integer.parseInt(st.nextToken());
                map[contryA - 1][contryB - 1] = 1;
                map[contryB - 1][contryA - 1] = 1;
            }
            bfs();
            sb.append(result - 1).append("\n");
        }
        String trim = sb.toString().trim();
        System.out.println(trim);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList();
        queue.add(0);
        visit[0] = true;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            result++;
            for (int i = 0; i < n; i++) {
                if (map[poll][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
