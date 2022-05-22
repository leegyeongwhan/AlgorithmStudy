package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2693 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int num = Integer.parseInt(st.nextToken());

    for (int i = 0; i < num; i++) { //4
      int[] arr = new int[10];
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 10; j++) {  //10
        arr[j] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(arr);
      System.out.println(arr[7]);
    }
  }
}
