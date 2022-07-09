package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] T = new int[n];
        int[] P = new int[n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.valueOf(st.nextToken());
            P[i] = Integer.valueOf(st.nextToken());
        }

        int[] dp = new int[n+1];
        int max = 0;
        //지금까지계산한값vs 지금해야할 계산 중 큰값
        for (int i = 0; i < n; i++) {
            if (i + T[i] <= n) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }
        System.out.println(dp[n]);
    }


}
