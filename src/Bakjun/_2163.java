package Bakjun;

import java.util.Scanner;

public class _2163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        System.out.println((M - 1) + M * (N - 1));
    }
}
