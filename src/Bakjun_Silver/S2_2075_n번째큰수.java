package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_2075_n번째큰수 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    StringTokenizer st;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        queue.add(Integer.parseInt(st.nextToken()));
      }
    }
 //   System.out.println(queue);
    Integer poll = 0;
    for (int i = 0; i < n; i++) {
      poll = queue.poll();
    }
    System.out.println(poll);
  }
}
