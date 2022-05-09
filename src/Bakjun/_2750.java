package Bakjun;

import java.util.*;

public class _2750 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int a[] = new int[num];
//    int count = num; // 난수 생성 갯수
//    int a[] = new int[count];
//    Random r = new Random();
//
//    for (int i = 0; i < count; i++) {
//      a[i] = r.nextInt(count) + 1; // 1 ~ 99까지의 난수
//      for (int j = 0; j < i; j++) {
//        if (a[i] == a[j]) {
//          i--;
//        }
//      }
//    }

    for (int i = 0; i < num; i++) {
      a[i] = scanner.nextInt();
    }
    int tmp = 0;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          tmp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = tmp;
        }
      }
    }
    for (int i = 0; i < num; i++) {
      System.out.println(a[i]);
    }
  }
}
