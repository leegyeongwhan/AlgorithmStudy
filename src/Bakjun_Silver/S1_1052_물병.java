package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1052_물병 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//n==43 m== 3

        int plus = 0;
        while (true) {
            int cnt = 0;
            int tmp = n + plus;
            while (tmp > 0) {
                if (tmp % 2 == 1) {
                    cnt++;
                }
                tmp /= 2;
            }
            if (cnt <= m) {
                break;
            }
            plus++;
        }
        System.out.println(plus);
    }
}

// 13 2
// 1101 , 1110 , 1111, 10000, 10001
//                             1
//  3 1
// 11 100
// 110 111 1000
//
