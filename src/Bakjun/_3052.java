package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


public class _3052 {   //두가지 방법 Hash Set 하나는 if문
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10];
    int cnt = 0;
    for (int i = 0; i < 10; i++) {
      arr[i] = Integer.parseInt(bufferedReader.readLine()) % 42;
    }
    boolean flag;
    for (int i = 0; i < arr.length; i++) {
      flag = false;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          flag = true;
          break;
        }
      }
      if (flag == false) {
        cnt++;
      }
    }
    System.out.println(cnt);
//
//    Scanner scanner = new Scanner(System.in);
//    HashSet<Integer> hashSet = new HashSet<Integer>();
//    for (int i = 0; i < 10; i++) {
//      hashSet.add(scanner.nextInt() % 42);
//    }
//    scanner.close();
//    System.out.println(hashSet.size());
  }
}
