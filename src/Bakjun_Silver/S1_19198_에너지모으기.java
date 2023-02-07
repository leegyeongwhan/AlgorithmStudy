package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S1_19198_에너지모으기 {
  static boolean visit[];
  static int sum = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;

    visit = new boolean[3];
    List<Integer> list = new ArrayList<>();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int m = Integer.parseInt(st.nextToken());
      list.add(m);
    }
// n번쨰 구슬이제거된다 -> 제거하기 쉽게 list
    dfs(0, list);
    System.out.println(sum);
  }

  private static void dfs(int num, List<Integer> list) {
    if (list.size() == 2) { //2개남을 때까지 반복
      sum = Math.max(sum, num);
      return;
    }
    //N을 1 감소시키고, 에너지 구슬을 1번부터 N번까지로 다시 번호를 매긴다. 번호는 첫 구슬이 1번, 다음 구슬이 2번, ... 과 같이 매겨야 한다.
    for (int i = 1; i < list.size() - 1; i++) { //양 끝의 구슬은 남겨야한다 즉 0번쨰 n번째 인덱스는 남겨야함
      int tmp = list.get(i);
      Integer start = list.get(i - 1);
      Integer last = list.get(i + 1);
      int hap = start * last;
      list.remove(i);
      dfs(num + hap, list);
      list.add(i, tmp);
    }
  }
}

