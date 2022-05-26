package Bakjun;

import java.util.Scanner;

public class _1357 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    scanner.close();

    int rev1 = Integer.parseInt(Rev(num1));
    int rev2 = Integer.parseInt(Rev(num2));

    int revSum = Integer.parseInt(Rev(rev1 + rev2));
    System.out.println(revSum);
//    StringBuilder sb = new StringBuilder();
//    StringBuilder str1 = new StringBuilder(String.valueOf(num1));
//    StringBuilder str2 = new StringBuilder(String.valueOf(num2));
//
//    StringBuilder chageStr1 = str1.reverse();
//    StringBuilder chageStr2 = str2.reverse();
//
//    int changeNum1 = Integer.parseInt(String.valueOf(chageStr1));
//    int changeNum2 = Integer.parseInt(String.valueOf(chageStr2));
//    int sum = 0;
//
//    sum = changeNum1 + changeNum2;
//   // System.out.println(sum);
//
//    StringBuilder chageStr3 = new StringBuilder(String.valueOf(sum));
//    StringBuilder chageStr4 = chageStr3.reverse();
//
//    int changeNum3 = Integer.parseInt(String.valueOf(chageStr4));
//
//    System.out.println(changeNum3);
  }

  static String Rev(int n) {
    String str = "";

    while (n > 0) {
      str += n % 10;
      n /= 10;
    }
    return str;
  }
}
