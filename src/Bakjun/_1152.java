package Bakjun;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();

    StringTokenizer st = new StringTokenizer(str, " ");
    System.out.println(st.countTokens());


//    str = str.trim();
//    if(str == "" || str == null){
//      System.out.println("111");
//      return;
//    }
//    String[] arr = str.split("\\s+");
//    int cnt = 0;
//
//    for (int i = 0; i < arr.length; i++) {
//     // System.out.println(arr[i]);
//      cnt++;
//    }
//    System.out.println(cnt);

  }


}
