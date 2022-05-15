package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    str = str.toUpperCase();
    int[] alphabet = new int[26];

    for (int i = 0; i < str.length(); i++) {
      alphabet[str.charAt(i) - 'A']++;
    }
//    for (int i = 0; i < alphabet.length; i++) {
//      System.out.println(alphabet[i]);
//    }
    int max = 0;
    char ch = ' ';
    for (int i = 0; i < alphabet.length; i++) {
      if (max < alphabet[i]) {
        max = alphabet[i];
        ch = (char) (i + 'A');
      } else if (max == alphabet[i]) {
        ch = '?';
      }
    }
    System.out.println(ch);

  }

}
