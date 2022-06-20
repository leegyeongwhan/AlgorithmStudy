package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int fiveCnt = 0;
        int twoeCnt = 0;

        for(int i=1; i<=n; i++) {
            int target = i;

            while((target % 2 == 0)) {
                twoeCnt++;
                target = target / 2;
            }
            while((target % 5 == 0)) {
                fiveCnt++;
                target = target / 5;
            }
        }

        System.out.println(Math.min(twoeCnt, fiveCnt));
    }

//        String str = String.valueOf(fc(n));
//        int cnt = 0;
//        for (int i = str.length() - 1; i > 0; i--) {
//            if (str.charAt(i) == '0') {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//
//    public static BigInteger fc(int num) {
//        BigInteger bigNumber1 = new BigInteger(String.valueOf(num));
//        if (num == 1 || num == 0) return new BigInteger("1");
//        return bigNumber1.multiply(fc(num - 1));
//    }
}
