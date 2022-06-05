package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2810 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'S') {
                cnt++;
            } else if (str.charAt(i) == 'L') {
                cnt++;
                i++;
            }
        }
        if (cnt > n) {
            System.out.println(n);
        } else {
            System.out.println(cnt);
        }
    }
}