package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _15596 {
//  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    int num = Integer.parseInt(bufferedReader.readLine());
//    _15596 s = new _15596();
//    s.sum(num);
//  }

  long sum(int[] a) {
    long hap = 0;

    for (int i = 0; i < a.length; i++) {
      hap += a[i];
    }
    return hap;
  }
}
