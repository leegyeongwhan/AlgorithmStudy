package Bakjun;

import java.util.Arrays;
import java.util.Scanner;

public class _2775 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] apart = new int[15][15];

    //answer = (k-1)1 호 + ......+ (k -1 )n 호까지1호부터 n호까지

    for (int i = 1; i < apart.length; i++) {        ///  아파트를 2차원 배열로 생성한 후 그 호수에 맞는 초기화를 해주자
      apart[i][1] = 1;
      apart[0][i] = i;
    }
//
//    for (int i = 0; i < apart.length; i++) {
//      for (int j = 0; j < apart[i].length; j++) {
//        System.out.print(apart[i][j]);
//      }
//      System.out.println();
//    }

    for (int i = 1; i < apart.length; i++) {        ///  아파트를 2차원 배열로 생성한 후 그 호수에 맞는 초기화를 해주자
      for (int j = 2; j < apart[i].length; j++) {
        apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
      }
    }

//    for (int i = 0; i < apart.length; i++) {
//      for (int j = 0; j < apart[i].length; j++) {
//        System.out.print(apart[i][j]);
//      }
//      System.out.println();
//    }
    int num = scanner.nextInt();
    for (int i = 0; i < num; i++) {
      int k = scanner.nextInt();
      int n = scanner.nextInt();
      System.out.println(apart[k][n]);
    }
  }
}
