package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_1748_수이어쓰기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int m = 0;
            int k = i;
            while (k > 0) {
                if (k / 10 == 0) {
                    m += 1;
                    break;
                } else {
                    k /= 10;
                    m += 1;
                }
            }
            sum += m;
        }
        System.out.println(sum);
    }
}
