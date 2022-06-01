package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        int stick = 64;
        br.close();
        while (num > 0) {
            if (stick > num) {
                stick /= 2;
            } else {
                cnt++;
                num -= stick;
            }
        }
        System.out.println(cnt);
    }
}
