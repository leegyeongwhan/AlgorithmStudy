package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_1531_투명 {
    static int[][] map = new int[101][101];
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken());
            int ry = Integer.parseInt(st.nextToken());

            for (int j = lx; j <= rx; j++) {
                for (int k = ly; k <= ry; k++) {
                    map[j][k]++;
                }
            }
        }

        for (int j = 0; j < 101; j++) {
            for (int k = 0; k < 101; k++) {
                if (map[j][k] > M) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
