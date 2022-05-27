package Bakjun;

import java.util.Scanner;

public class _5597 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[31];
    int[] arrStudent = new int[31];
    for (int i = 0; i < 28; i++) {
      int num = scanner.nextInt();
      arr[i] = num;
    }

//    for (int i = 0; i < arr.length; i++) {
//      System.out.println(arr[i]);
//    }

    for (int i = 0; i < arr.length; i++) {
      arrStudent[arr[i]]++;
    }

    for (int i = 0; i < arrStudent.length; i++) {
      if (arrStudent[i] == 0) {
        System.out.println(i);
      }
    }
  }
}
