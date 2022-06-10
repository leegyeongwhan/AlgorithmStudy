package Bakjun_Silver;

import java.util.Scanner;

public class _11726 {
    static int[] arr = new int[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dp(n));
    }

    public static int dp(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (arr[n] != 0) return arr[n];
        return arr[n] = (dp(n - 1) + dp(n - 2)) % 10007;
    }
}
