package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2902 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = (br.readLine());
    String answer = "";

    answer += str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == '-') {
        answer += str.charAt(i + 1);
      }
    }
    System.out.println(answer);
  }
}
