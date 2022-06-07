package Bakjun;

import java.util.Scanner;

public class _2747 {
    static Long[] arr;

    public static Long fivo(int n) {
        int sum = 0;
        if (arr[n] == null) {
            arr[n] = fivo(n - 1) + fivo(n - 2);
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new Long[n + 1];
        arr[0] = 0L;
        arr[1] = 1L;
        System.out.println(fivo(n));
    }
}
