package Bakjun;

import java.io.BufferedReader;
import java.util.Scanner;

public class _2798 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      int num = scanner.nextInt();
      arr[i] = num;
    }
    int sum = 0;
    int result = 0;
    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int z = j + 1; z < N; z++) {
          sum = arr[i] + arr[j] + arr[z];
          if (sum == M) {
            System.out.println(sum);
            return;
          }
          if (result < sum && sum < M) {
            result = sum;
          }
        }
      }
    }
    System.out.println(result);
  }
}
