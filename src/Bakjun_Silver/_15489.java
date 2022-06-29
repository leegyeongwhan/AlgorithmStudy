package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[][] arr = new int[30][30];
        arr[1][1] = 1;

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j <= i; j++) {
                //점화식
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        int sum = 0;

        for (int i = 0; i < W; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[R + i][C + j];
            }
        }
        System.out.print(sum);

    }
}
