package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<Integer>();

    for (int i = 1; i <= 1000; i++) {
      for (int j = 0; j < i; j++) {
        // System.out.print(i);
        list.add(i);
      }
    }
    int sum = 0;
    while (A <= B) {
      sum += list.get(A - 1);
      A++;
    }
    System.out.println(sum);
  }
}
