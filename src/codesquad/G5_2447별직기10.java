package codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class G5_2447별직기10 {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        map = new char[n][n];

        rec(0, 0, n, false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void rec(int x, int y, int n, boolean blank) {

        if (blank) { //빈공간이라면
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    map[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {//종료조건
            map[x][y] = '*';
            return;
        }

        int blockSize = n / 3;
        int cnt = 0;
        for (int i = x; i < x + n; i += blockSize) {
            for (int j = y; j < y + n; j += blockSize) {
                cnt++;
                if (cnt == 5) {
                    rec(i, j, blockSize, true);
                } else {
                    rec(i, j, blockSize, false);
                }
            }
        }
    }
}
