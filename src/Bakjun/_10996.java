package Bakjun;

import java.util.Scanner;

public class _10996 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    if (num == 1) {
      System.out.println("*");
    } else {
      for (int i = 0; i < num * 2; i++) {
        for (int j = 0; j < num; j++) {
          if ((j+i) % 2 == 0) {           // i+j로 홀짝컨트롤
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
}
