package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10809 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   // char[] alpabet = new char[26];
    int[] arr = new int[26];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }
//    char ch = 'a';
//    for (int i = 0; i < alpabet.length; i++) {
//      alpabet[i] = ch;
//      System.out.println(ch);
//      ch++;
//    }
    StringBuilder sb = new StringBuilder();

    String str = br.readLine(); //baekjoon
    for (int i = 0; i < str.length(); i++) {
      int j = 0;
//      for (j = 0; j < alpabet.length; j++) {
//        if (str.charAt(i) == alpabet[j]) {
//
//          arr[j] = i;
//        }
      char ch1 = str.charAt(i);

      if (arr[ch1 - 'a'] == -1) {  // arr 원소 값이 -1 인 경우에만 초기화
        arr[ch1 - 'a'] = i;
      }
    }
    for (
            int val : arr) {  // 배열 출력
      System.out.print(val + " ");
    }
  }

}
