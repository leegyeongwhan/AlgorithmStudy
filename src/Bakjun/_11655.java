package Bakjun;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11655 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char ch = ' ';
    for (int i = 0; i < str.length(); i++) {
      if (('A' <= str.charAt(i) && str.charAt(i) <= 'Z') ||
              ('a' <= str.charAt(i) && str.charAt(i) <= 'z')) {   //알파벳의 범위
        ch = (char) (str.charAt(i) + 13);

        if (ch > 122) {
          int tmp = ch - 122;
          ch = (char) ('a' + tmp - 1);
        }
        if ('N' <= str.charAt(i) && str.charAt(i) <= 'Z') {
          int tmp = ch - 90;
          ch = (char) ('A' + tmp - 1);
        }
      } else {             //알파벳아닌놈은 그냥찍자
        ch = str.charAt(i);
      }
      System.out.print(ch);
    }
  }
}
