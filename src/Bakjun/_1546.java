package Bakjun;

import java.util.Scanner;

public class _1546 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int subject = scanner.nextInt();

    int jumsu = 0;
    int[] arr = new int[subject];

    for (int i = 0; i < subject; i++) {
      jumsu = scanner.nextInt();
      arr[i] = jumsu;
    }

    int tmp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int min_index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_index]) {
          tmp = arr[min_index];
          arr[min_index] = arr[j];
          arr[j] = tmp;
        }
      }
    }

    double max = 0;
    double hap = 0;
    max = arr[arr.length - 1];
    for (int i = 0; i < arr.length; i++) {
      hap += (arr[i] / max) * 100;
    }
    System.out.println(hap / arr.length);
  }
}
