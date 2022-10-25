package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2445_별찍8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = n * 2 - 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            k -= 2;
            System.out.println();
        }

        k = 2;
        int p = n-1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < p; j++) {
                System.out.print("*");
            }
            k += 2;
            p--;
            System.out.println();
        }
    }
}
