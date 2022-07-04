package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int a = 0;
        int b = 0;
        int c = 0;
        int cnt = 0;
        while (true) {
            if (a == E && b == S && c == M) {
                break;
            }
            a++;
            b++;
            c++;
            if (a >= 16) {
                a = 1;
            }
            if (b >= 29) {
                b = 1;
            }
            if (c >= 20) {
                c = 1;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
