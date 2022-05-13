package Inflean;

import java.util.Scanner;

public class _4 {
  void solution(int num) {
    Scanner scanner = new Scanner(System.in);
    String str = "";
    String reverse ;
    for (int i = 0; i < num; i++) {
      str = scanner.next();
      reverse = "";
      for (int j = str.length() - 1; j >= 0; j--) {
        reverse += str.charAt(j);
      }
      System.out.println(reverse);
      System.out.println();
    }
   }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    _4 t = new _4();
    t.solution(num);
  }
}
