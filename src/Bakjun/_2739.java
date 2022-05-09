package Bakjun;

import java.util.Scanner;

public class _2739 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    for (int i = 1; i <= 9; i++) {
//      for (int j = 1; j <= 9; j++) {
//        System.out.printf("%d * %d = %d %n" ,i ,j ,i*j);
//      }
        System.out.printf("%d * %d = %d %n", num, i, num * i);
    }
    scanner.close();
  }
}
