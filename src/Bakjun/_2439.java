package Bakjun;

import java.util.Scanner;

public class _2439 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (j < num - i - 1) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
