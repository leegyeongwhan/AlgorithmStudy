package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _S3_9095_123더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] dp = new int[11];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int m = Integer.parseInt(br.readLine());
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int n = 4; n < dp.length; n++) {   //4보다클때
                dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
            }
            sb.append(dp[m]).append("\n");
        }
        System.out.println(sb);
    }
}
