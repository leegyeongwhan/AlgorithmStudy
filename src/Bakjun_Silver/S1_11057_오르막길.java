package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_11057_오르막길 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][10];

        //길이가 1
        for (int i = 0; i <= 9; i++) {
            dp[0][i] = 1;
        }

        //dp[i][n] = dp[i-1][0~9-n]
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = j; k <= 9; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        //    System.out.println(Arrays.deepToString(dp));

        System.out.println(dp[n][0] % 10007);
    }
}
