package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _11651 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    ;
    int num = Integer.parseInt(st.nextToken());
    int[][] xy = new int[num][2];

    for (int i = 0; i < num; i++) {  //5
      st = new StringTokenizer(br.readLine());  //2
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      xy[i][0] = x;
      xy[i][1] = y;
    }

    Arrays.sort(xy, new Comparator<int[]>() {
      @Override
      public int compare(int[] xy1, int[] xy2) {
        if (xy1[1] == xy2[1]) {
          return xy1[0] - xy2[0];
        } else {
          return xy1[1] - xy2[1];
        }
      }
    });

    for (int i = 0; i < num; i++) {  //5
      for (int j = 0; j < xy[i].length; j++) {
        System.out.print(xy[i][j] + " ");
      }
      System.out.println();
    }

  }
}
