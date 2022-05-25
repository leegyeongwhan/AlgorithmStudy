package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2167 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numRaw = Integer.parseInt(st.nextToken()); //2
    int numCal = Integer.parseInt(st.nextToken()); //3
    int[][] arr = new int[numRaw][numCal];

    for (int i = 0; i < numRaw; i++) {
      st = new StringTokenizer(br.readLine());    //2번째 줄을 읽기위해 참조 변수 st 에 새로운 객체 생성  1 , 2  , 4
      for (int j = 0; j < numCal; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
//    for (int i = 0; i < numRaw; i++) {
//      for (int j = 0; j < numCal; j++) {
//        System.out.print(arr[i][j]);
//      }
//      System.out.println();
//    }
    st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken()); // hap

    int i = 0;
    int j = 0;
    int x = 0;
    int y = 0;
    for (int z = 0; z < num; z++) {
      st = new StringTokenizer(br.readLine());
      i = Integer.parseInt(st.nextToken()) - 1;
      j = Integer.parseInt(st.nextToken()) - 1;
      x = Integer.parseInt(st.nextToken()) - 1;
      y = Integer.parseInt(st.nextToken()) - 1;
      int sum = 0;

      for (int a = i; a <= x; a++) {
        for (int b = j; b <= y; b++) {
          sum += arr[a][b];
        }
      }
      System.out.println(sum);
    }
  }
}
