package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int d = a;
    int sum = 0;
    sum = 1 + (c - d) / (a - b);
    if (0 != (c - d) % (a - b)) {
      sum += 1;
      System.out.println(sum);
    }else{
      System.out.println(sum);
    }
  }
}