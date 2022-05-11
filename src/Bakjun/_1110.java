package Bakjun;

import sun.usagetracker.UsageTrackerClient;

import java.util.Scanner;

public class _1110 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    int cnt = 0;
    int su = n;

    while (true) {
      n = (n % 10) * 10 + ((n / 10) + (n % 10) % 10);
      cnt++;

      if (su == n) {
        break;
      }
    }
    System.out.println(cnt);
//    int number = num;
//    int mox = 0;
//    int namuji = 0;
//    String str = "";
//    int count = 0;
//    int su = 0;
//
//    if (num == 0) {
//      count = 1;
//      System.out.println(count);
//    } else {
//      while (number != su) {
//        if (su > 0) {
//          num = su;
//        }
//        mox = num / 10;
//        namuji = num % 10;
//        str = "" + namuji + (namuji + mox) % 10;
////      char a = (str.charAt(0));
////      char b = (str.charAt(1));
//        //   System.out.println(str);
//        su = Integer.parseInt(str);
//        count++;
//      }
//      System.out.println(count);
//    }
  }
}
