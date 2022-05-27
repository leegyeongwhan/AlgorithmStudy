package Bakjun;

import java.util.Scanner;

public class _3460 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num2 = scanner.nextInt();
    StringBuilder sb = new StringBuilder();
    String[] arr = new String[num2];

    for (int i = 0; i < num2; i++) {
      int num = scanner.nextInt();
      String str = "";
      while (num != 1) {
        str += num % 2;
        num /= 2;
      }
      str += num;
      arr[i] = str;
    }

    for (String str : arr){
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='1'){
          System.out.print(i+" ");
        }
      }
    }
  }
}
