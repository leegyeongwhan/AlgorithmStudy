package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _1259 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();

    while (!str.equals("0")) {
      boolean flag = true;
      int j = str.length() - 1;
      int i = 0;

      while (i < j) {
        if (str.charAt(i) == str.charAt(j)) {
          i++;
          j--;
        } else {
          flag = false;
          break;
        }
      }
      if (flag) {
        sb.append("yes");
      } else {
        sb.append("no");
      }
      str = br.readLine();
      sb.append("\n");
    }
    System.out.println(sb);

  }
}
