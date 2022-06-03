package Bakjun_Silver;

import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        while (n > 0) {
            //  System.out.println("n = " + n);
            if (n == 1) {
                break;
            }
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
                // System.out.println("n = " + n);
                i = 1;
            }
            i++;
        }
    }
}
