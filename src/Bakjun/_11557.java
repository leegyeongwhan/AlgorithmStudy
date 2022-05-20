package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _11557 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int max = 0;
    String[] dap = new String[1];

    for (int i = 0; i < num1; i++) {  //test갯수2
      int num2 = scanner.nextInt();
      for (int j = 0; j < num2; j++) { //학교숫자 3
        String school = scanner.next();
        int alcohol = Integer.parseInt(scanner.next());//학교숫자 3
        if (max < alcohol) {
          max = alcohol;
          dap[0] = school;
        }
      }
      System.out.println(dap[0]);
    }

  }
}
