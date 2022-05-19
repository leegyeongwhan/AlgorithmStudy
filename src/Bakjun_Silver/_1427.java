package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _1427 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    String str = String.valueOf(num);
    //System.out.println(str);
    String[] arr = str.split("");

    int min = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])) {
          min = Integer.parseInt(arr[j]);
          arr[j] = arr[i];
          arr[i] = String.valueOf(min);
        }
      }
    }
    int[] arr1 = new int[arr.length];
    for (int i =0 ; i<arr.length; i++){
      arr1[i] = Integer.parseInt(arr[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr1[i]);
    }

  }
}
