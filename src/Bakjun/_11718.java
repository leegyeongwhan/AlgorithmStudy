package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _11718 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String str = "";

//    while ((scanner.hasNext())) {
//      System.out.println(str = scanner.nextLine());
//    }
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while ((str = br.readLine()) != null){
      System.out.println(str);
      }
    StringBuilder builder = new StringBuilder();
    while (true) {
      String str1 = br.readLine();
        if (str1 == null || str1.isEmpty()) {
          break;
        }
        builder.append(str).append("\n");
    }
    br.close();
    System.out.println(builder);
  }
}
