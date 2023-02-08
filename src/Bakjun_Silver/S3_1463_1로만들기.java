package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int dp[] = new int[number + 1]; //10

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            //  3을나눈 값 2를 나눈값 -1 을 한값중 최솟값을 구한다
            dp[i] = dp[i - 1] + 1; //
            if (i % 2 == 0) dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            if (i % 3 == 0) dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
        }
        System.out.println(dp[number]);
    }
}