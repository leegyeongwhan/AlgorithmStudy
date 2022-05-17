package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int cnt = 1;
    int sum = 2;
    while (num >= sum) {
      sum = sum + (cnt * 6);
      cnt++;
    }
    System.out.println(cnt);
  }
}
