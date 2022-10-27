package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1149_RGB거리 {
    static int[][] dp;
    static int[][] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        cost = new int[n][3];
        dp = new int[n][3];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            cost[i][0] = R;
            cost[i][1] = G;
            cost[i][2] = B;
        }
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.print(Math.min(costMethod(n - 1, 0), Math.min(costMethod(n - 1, 1), costMethod(n - 1, 2))));
    }

    private static int costMethod(int n, int color) {
        //방문하지 않은 경우
        if (dp[n][color] == 0) {

            if (color == 0) {
                dp[n][0] = Math.min(costMethod(n - 1, 1), costMethod(n - 1, 2)) + cost[n][0];
            } else if (color == 1) {
                dp[n][1] = Math.min(costMethod(n - 1, 0), costMethod(n - 1, 2)) + cost[n][1];
            } else if (color == 2) {
                dp[n][2] = Math.min(costMethod(n - 1, 0), costMethod(n - 1, 1)) + cost[n][2];
            }
        }
        return dp[n][color];
    }
}
