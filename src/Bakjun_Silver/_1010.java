package Bakjun_Silver;

import java.util.Scanner;

public class _1010 {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();  //MCN

            //  System.out.printf("%.0f\n", dp(M, N));
            sb.append(dp(M, N)).append("\n");
        }
        System.out.println(sb);
    }

//    static double dp(int M, int N) {
//            double a = 1;
//            double b = 1;
//
//            for (int i = M; i > M - N; i--) {
//                a = a * i;
//            }
//
//            for (int i = N; i > 0; i--) {
//                b = b * i;
//            }
//            return a / b;
//    }

    static int dp(int M, int N) {
        if (dp[M][N] > 1) {
            return dp[M][N];
        }
        if (N == 0 || M == N) {
            return dp[M][N] = 1;
        }
        return dp[M][N] = dp(M - 1, N - 1) + dp(M - 1, N);
    }
}
