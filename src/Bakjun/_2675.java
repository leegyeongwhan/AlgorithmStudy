package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2675 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    //   System.out.println(num);
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < num; i++) {  //2
      int n = scanner.nextInt();  //3
      String str = scanner.next(); //ABC  /htp
      String answer = "";

      for (int j = 0; j < str.length(); j++) {
        for (int z = 0; z < n; z++) {
          System.out.print(str.charAt(j));
        }
      }
      System.out.println();
    }
  }
}
