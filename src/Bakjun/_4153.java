package Bakjun;

import java.util.Scanner;

public class _4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = scanner.nextInt();
        int width = scanner.nextInt();
        int wide = scanner.nextInt();
        do {
            int a2 = (int) Math.pow((double) high, (double) 2);
            int b2 = (int) Math.pow((double) width, (double) 2);
            int c2 = (int) Math.pow((double) wide, (double) 2);

            if (a2 + b2 == c2 || a2 + c2 == b2 || c2 + b2 == a2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            high = scanner.nextInt();
            width = scanner.nextInt();
            wide = scanner.nextInt();
        } while (high != 0 && wide != 0 && wide != 0);


    }
}
