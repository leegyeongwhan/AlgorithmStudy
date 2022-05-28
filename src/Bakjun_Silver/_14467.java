package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class _14467 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int cnt = 0;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int cows = Integer.parseInt(st.nextToken());    //key
      int position = Integer.parseInt(st.nextToken());   //value

      if (map.get(cows) == null) {      //map.get (ket) 값은 --> key 에 해당하는 value 값
        map.put(cows, position);
      } else {  //map에 중복되는 key값 즉 소가있다면
        if (map.get(cows) != position) {
          cnt++;
          map.put(cows, position);
        }
      }
    }
    System.out.println(cnt);

//    Iterator<Integer> keys = map.keySet().iterator();
//    while (keys.hasNext()) {
//      int key = keys.next();
//      System.out.println("[Key]:" + key + " [Value]:" + map.get(key));
//    }

  }
}
