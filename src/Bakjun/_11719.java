package Bakjun;

import java.util.Scanner;

public class _11719 {
  public static void main(String[] args) {
    _11719 t = new _11719();
    t.ouputScanner();
  }

  void ouputScanner() {
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    while (scanner.hasNext()) {
      String str = scanner.nextLine();
      sb.append(str + "\n");
    }
    System.out.println(sb);
  }
}
