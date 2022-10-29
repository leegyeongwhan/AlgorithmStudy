package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2523_별찍13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = n * 2 - 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int p = n - 1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("*");
            }
            p--;
            System.out.println();
        }
    }
}
