package Bakjun;

import java.util.Scanner;

public class _10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println( facto(num));

    }

    static int facto(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * facto(num - 1);
    }
}
