package Bakjun_Silver;

import java.util.Scanner;

public class _9625 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[46][2];

        arr[0][0] = 1; //A
        arr[0][1] = 0; //A

        for (int i = 1; i <= n; i++) {
            arr[i][0] = arr[i - 1][1];  // A의값은 그전 B의값
            arr[i][1] = arr[i - 1][0] + arr[i - 1][1];  // B의값은 그전 A+B의 값
        }
        System.out.println(arr[n][0] + " " + arr[n][1]);
    }
}
