package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
   . 문제에서 삼각혀의 마지막 숫자를 알려주기때문에 최상단 의 수의 합이 답이다
 */
public class _S2_1932_정수삼각형 {
    static int[][] arr;
    static int[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        dp = new int[n][n];

        //구하고자 하는 값 dp[0][0]

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
    //    System.out.println(Arrays.deepToString(arr));

        //dp 최하단 값 구하기
        for (int i = 0; i < n; i++) {
            dp[dp.length - 1][i] = arr[dp.length - 1][i];
        }
     //   System.out.println(Arrays.deepToString(dp));

        //답은 dp[0][0]
        System.out.println(dfs(0, 0));
    }

    //행이 깊이  index가 열
    private static int dfs(int depth, int index) {
        if (depth == n - 1) {
            //저장된 마지막 행의 dp값
            return dp[depth][index];
        }
        // dp 를 아직 방문하지않았다면 arr 값과 dp의 큰값을 합친값이 dp값
        if (dp[depth][index] == 0) {
            dp[depth][index] = Math.max(dfs(depth + 1, index), dfs(depth + 1, index + 1)) + arr[depth][index];
        }
        return dp[depth][index];

    }
}
