package Bakjun;

import java.util.Scanner;

public class _8958 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String str = "";
    int count;
    int sum;

    for (int i = 0; i < num; i++) {
      str = scanner.next();  //문제의 반복
      count = 0; sum = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == 'O') {
          count = count  + 1;
          sum += count;
        } else {
          count = 0;
        }
      }
      System.out.println(sum);
    }

  }
}
