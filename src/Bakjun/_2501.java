package Bakjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2501 {
  static int n, k;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    k = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        k--;
      }
      if (k == 0) {
        System.out.println(i);
        break;
      }
    }
    if (k != 0) {
      System.out.println(0);
    }
//    int k = scanner.nextInt();
//    List<Integer> list = new ArrayList<Integer>();
//    StringBuilder st = new StringBuilder();
//    int cnt = 0;
//    for (int i = 1; i <= num1; i++) {
//      if (num1 % i == 0) {
//        //  System.out.println(i);
//        list.add(i);
//        cnt++;  //약수의 수
//      }
//    }
//    if (k > cnt) {     //k가 수도보다 크게들어오면 0리턴
//      System.out.println("0");
//    } else {
//      System.out.println(list.get(k - 1));
//    }


  }
}
