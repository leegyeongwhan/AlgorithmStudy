package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (x == 1) {
                break;
            }
            if (x % 3 == 0) {
                x = x / 3;
                cnt++;
            } else if (x % 2 == 0) {
                x = x / 2;
                cnt++;
            } else {
                x -= 1;
                cnt++;
            }
            System.out.println(x);
        }
        System.out.println(cnt);
    }
}
