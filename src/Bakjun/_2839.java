package Bakjun;

import java.util.Scanner;

public class _2839 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int cnt = 0;

    while (true) {
      if (num % 5 == 0) {
        num /= 5;
        cnt += num;
        System.out.println(cnt);
        break;
      } else if (num >= 3) {
        num -= 3;
        cnt++;
      } else {
        System.out.println("-1");
        break;
      }
    }
  }
}
