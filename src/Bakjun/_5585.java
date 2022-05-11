package Bakjun;

import java.util.Scanner;

public class _5585 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 1000 - scanner.nextInt();
    int[] en = {500, 100, 50, 10, 5, 1};
    int count = 0;

    for (int i = 0; i < en.length; i++) {
      count += num / en[i];
      num %= en[i];
    }
    System.out.println(count);
  }
}
