package Bakjun_Silver;

import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int cnt = 0;
        while (true) {
            if (String.valueOf(i).contains("666")) {
                cnt++;
                if (cnt == n) break;
            }
            i++;
        }
        System.out.println(i);
    }
}
