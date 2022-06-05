package Bakjun;

import java.util.Scanner;

public class _10162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = {300, 60, 10};

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            if (num % 10 != 0) {
                System.out.println("-1");
                return;
            }
            while (num - arr[i] >= 0) {
                num -= arr[i];
                // System.out.println("num = " + num);
                cnt++;
            }
            System.out.print(cnt + " ");
        }
    }
}
