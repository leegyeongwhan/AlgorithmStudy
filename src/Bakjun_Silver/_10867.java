package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _10867 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    // Set<Integer> set = new HashSet<Integer>();
    Set<Integer> threeSet = new TreeSet<Integer>();
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < num; i++) {
      while (st.hasMoreTokens()) {
        threeSet.add(Integer.parseInt(st.nextToken()));
      }
    }

    Iterator it = threeSet.iterator();

    while (it.hasNext()){
        sb.append(it.next()+" ");
    }
    System.out.println(sb);
//
//    List<Integer> list = new ArrayList<Integer>(set);
////    threeSet.addAll(set);
//    Collections.sort(list);
//    for (int i = 0; i < list.size(); i++) {
//      System.out.print(list.get(i));
//      if (i < list.size() - 1) {
//        System.out.print(" ");
//      }
//    }
  }
}
