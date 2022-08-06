package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _S2_6603_로또 {
    static int K;
    static int[] S;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            K = sc.nextInt();
            if (K == 0) {
                return;
            }
            S = new int[K];
            visit = new boolean[K];

            for (int i = 0; i < K; i++) {
                S[i] = sc.nextInt();
            }
         //   System.out.println(Arrays.toString(S));
            dfs(0, 0);
            System.out.println();
        }
    }

    private static void dfs(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < K; i++) {
                if (visit[i]) {
                    System.out.print(S[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i < K; i++) {
            visit[i] = true;
            dfs(depth + 1, i + 1);
            visit[i] = false;
        }

    }
}
