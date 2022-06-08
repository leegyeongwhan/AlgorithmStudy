package Bakjun;

import java.util.Scanner;

public class _9085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int n2 = scanner.nextInt();
            int sum = 0;
            for (int j = 0; j < n2; j++) {
                int n3 = scanner.nextInt();
                sum += n3;
            }
            System.out.println(sum);
        }
    }
}
