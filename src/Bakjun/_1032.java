package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1032 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int num = Integer.parseInt(st.nextToken());
    String[] arr = new String[50];
    for (int i = 0; i < num; i++) {   //2
      st = new StringTokenizer(br.readLine());  //contest.txt     //context.txt
      arr[i] = st.nextToken();
    }

    StringBuilder sb = new StringBuilder();
    boolean def;
    for (int i = 0; i < arr[0].length(); i++) { //50
      def = false;
      for (int j = 0; j < num - 1; j++) {
        if (arr[j].charAt(i) != arr[j + 1].charAt(i)) {     //n번씩 반복
          def = true;
          break;
        }
      }
      if (def) {
        sb.append("?");
      } else {
        sb.append(arr[0].charAt(i));
      }
    }
    System.out.println(sb);
  }
}
