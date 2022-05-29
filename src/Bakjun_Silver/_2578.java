package Bakjun_Silver;

import java.util.Scanner;

public class _2578 {
  static int[][] binggo = new int[5][5];
  static int bingCount = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int row = 5;
    int calm = 5;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < calm; j++) {
        binggo[i][j] = scanner.nextInt();
      }
    }

    for (int n = 1; n <= 25; n++) {
      int num = scanner.nextInt();
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < calm; j++) {
          if (binggo[i][j] == num) {
            binggo[i][j] = 0;
          }
        }
      }
      checkCalm();
      checkRaw();
      checkLeftDegack();
      checkRightDegack();
      if (bingCount >= 3) {
        System.out.println(n);
        break;
      }
      bingCount = 0;
    }

  }

  static void checkRaw() {
    for (int i = 0; i < 5; i++) {
      int count = 0;
      for (int j = 0; j < 5; j++) {
        if (binggo[i][j] == 0) {
          count++;
        }
      }
      if (count == 5) {
        bingCount++;
      }
    }
  }

  static void checkCalm() {
    for (int i = 0; i < 5; i++) {
      int count = 0;
      for (int j = 0; j < 5; j++) {
        if (binggo[j][i] == 0) {
          count++;
        }
      }
      if (count == 5) {
        bingCount++;
      }
    }
  }

  static void checkRightDegack() {
    int count = 0;
    for (int i = 0; i < 5; i++) {
      if (binggo[i][i] == 0) {
        count++;
      }
      if (count == 5) {
        bingCount++;
      }
    }
  }

  static void checkLeftDegack() {
    int len = 4;
    int count = 0;
    for (int i = 0; i < 5; i++) {
      if (binggo[i][len - i] == 0) {
        count++;
      }
      if (count == 5) {
        bingCount++;
      }
    }
  }


}



