package Bakjun;

import java.util.Scanner;

public class _2562 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int[] arr = new int[9];
    int cnt = 0;

    for (int i = 0; i < 9; i++) {
      int num = scanner.nextInt();
      arr[i] = num;   // 모든 숫자를 넣는다
    }

    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];  //최댓값
        cnt = i +1;
      }
    }
//    for (int i = 0; i < arr.length; i++) {
//      System.out.println(arr[i]);
//    }
    System.out.println(max);
    System.out.println(cnt);
  }
}
