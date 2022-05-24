package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10988 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    if (checkPalindrom(str)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  static boolean checkPalindrom(String str) {
    int max = str.length() - 1;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(max - i)) {
        return false;
      }
    }
    return true;
  }
}
