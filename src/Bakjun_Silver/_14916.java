package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (num > 0) {
            if (num == 1) {
                cnt = -1;
                break;
            }
            if (num == 0) {
                cnt = 0;
                break;
            }
            if (num % 5 == 0) {
                cnt += num / 5;
                break;
            }
            num -= 2;
            cnt++;
        }
        System.out.println(cnt);
    }

}
