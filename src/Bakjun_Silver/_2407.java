package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _2407 {
    static BigInteger[][] arr = new BigInteger[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = BigInteger.valueOf(0);
            }
        }
        arr[0][0] = BigInteger.valueOf(1);
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = BigInteger.valueOf(1);
        }
        dp(N, M);
      //  System.out.println(Arrays.deepToString((arr)));
        System.out.println(arr[N][M]);
    }
    //파스칼의 삼각형 점화식 >> 조합

    private static void dp(int n, int m) {
        for (int i = 1; i < arr.length; i++) {
            //파스칼 점화식
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = arr[i - 1][j - 1].add(arr[i - 1][j]);
            }
        }
    }
}
