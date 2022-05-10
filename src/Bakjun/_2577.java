package Bakjun;

import java.util.Scanner;

public class _2577 {
  void infoNumber(int a, int b, int c) {
//    int multiply = 0;
//    String str = "";
//    multiply = a * b * c;
//    char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//    int[] count = new int[10];
//    str = String.valueOf(multiply);
//
//    for (int i = 0; i < str.length(); i++) {
//      for (int j = 0; j < arr.length; j++) {
//        if (str.charAt(i) == arr[j]) {
//          //   System.out.println(str.charAt(i));  //17037300
//          count[j]++;
//          // System.out.println(j);
//          //   System.out.println(count[j]);
//        }
//      }
//    }
//    for (int i = 0; i < count.length; i++) {
//      System.out.println(count[i]);
//    }

  }

  public static void main(String[] args) {
    _2577 s = new _2577();
    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
    int value = (scanner.nextInt()) * (scanner.nextInt()) * (scanner.nextInt());
    String str = Integer.toString(value);
    scanner.close();

    for (int i = 0; i < 9; i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) - '0' == i) {
          count++;
        }
      }
      System.out.println(count);
    }
  }

}
