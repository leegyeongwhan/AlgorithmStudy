package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    int i = 0;
    while (st.hasMoreTokens()) {
      arr[i] = Integer.parseInt(st.nextToken());
      i++;
    }
    Arrays.sort(arr);
    System.out.println(arr[0]);
    System.out.println(arr[arr.length - 1]);

  }
}
