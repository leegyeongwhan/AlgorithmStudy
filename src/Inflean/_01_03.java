package Inflean;

import java.util.Arrays;
import java.util.Scanner;

public class _01_03 {
  public String solution(String str) {
    String answer = "";
    int n = 0;
    int max = 0;

    while ((n = str.indexOf(" ")) != -1) {
      //  System.out.println(n);
      String x = str.substring(0, n);
      int len = x.length();

      if (max < len) {
        max = len;
        answer = x;
      }
      str = str.substring(n + 1);
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    _01_03 m = new _01_03();
    String str = kb.nextLine();
    System.out.println(m.solution(str));
  }

}
