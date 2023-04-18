package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1436_영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        int cnt = 0;
        int num = 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = String.valueOf(num);
            if (str.contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                sb.append(num);
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
//1 666
//2 1666
//3 2666
//...
// 9666
// 10666
// 11666
//  10000
//
