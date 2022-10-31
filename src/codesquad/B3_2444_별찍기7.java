package codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2444_별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            k--;
            System.out.println();
        }

        k = n - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k * 2 - 1; j++) {
                System.out.print("*");
            }
            k--;
            System.out.println();
        }
    }
}
