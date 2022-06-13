package Bakjun_Silver;//package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _10826 {
    static BigInteger[] arr = new BigInteger[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp(num);
    }

    static void dp(int num) {
        arr[0] = new BigInteger("0");
        arr[1] = new BigInteger("1");
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }
        System.out.println(arr[num]);
    }

}
