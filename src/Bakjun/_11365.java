package Bakjun;

import java.util.Scanner;

public class _11365 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb;
    while (true) {
      String str = scanner.nextLine();
      if (str.equals("END")) {
        break;
      }
      sb = new StringBuilder();
      sb.append(str).reverse();
      System.out.println(sb);
    }

  }
}
