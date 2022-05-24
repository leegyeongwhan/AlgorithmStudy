package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11050 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());
    System.out.println(dp(num1, num2));
  }

  static int dp(int n, int r) {
    if (n == r || r == 0) return 1;
    return dp(n - 1, r - 1) + dp(n - 1, r);
  }
}
