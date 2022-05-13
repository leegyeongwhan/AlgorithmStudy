package Inflean;

import java.util.Locale;
import java.util.Scanner;

public class _01_01 {
  public int solution() {
    Scanner in = new Scanner(System.in);
    String input1 = in.next();
    input1 = input1.toUpperCase();  //대문자
    char input2 = in.next().charAt(0);
    input2 = Character.toUpperCase(input2);
    int cnt = 0;

    for (int i = 0; i < input1.length(); i++) {
      if (input1.charAt(i) == input2) {
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    _01_01 s = new _01_01();
    s.solution();
  }
}
