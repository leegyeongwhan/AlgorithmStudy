package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());
    int max = 0;
    int min = 0;

    if (num1 > num2) {
      max = num1;
      min = num2;
    } else {
      max = num2;
      min = num1;
    }
    int d = gcd(max, min);

    System.out.println(d);
    System.out.println(max * min / d);

  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int r = a % b;

      a = b;
      b = r;
    }
    return a;
  }
}