package Bakjun_Silver;

import java.util.Scanner;

public class _15649 {

    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        visit = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);
    }

    private static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        /////////방문 한다음 꺼준다
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
}
