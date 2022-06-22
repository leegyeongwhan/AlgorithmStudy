package Bakjun;

import java.util.Scanner;

public class _25191 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();
        int bear = scanner.nextInt();
        int coke = scanner.nextInt();

        int cnt = 0;

        while (true) {
            if (bear >= 2 && chicken != 0) {
                chicken -= 1;
                bear -= 2;
                cnt++;
            } else if (coke >= 1 && chicken != 0) {
                chicken -= 1;
                coke -= 1;
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}
