package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S1_5525_IOIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n * 2 + 1; i++) {
            if (i % 2 == 0) {
                sb.append("I");
            } else {
                sb.append("O");
            }
        }

        String input = br.readLine();
        String str = sb.toString();
        int cnt = 0;
        int idx = 0;

        for (int i = 0; i < S; i++) {
            if (input.charAt(i) == str.charAt(idx)) {
                idx++;
            } else {
                if (input.charAt(i) == 'I') {
                    idx = 1;
                } else {
                    idx = 0;
                }
            }
            if (idx == n * 2 + 1) {
                cnt++;
                idx -= 2;
            }
        }
        System.out.println(cnt);
    }
}
