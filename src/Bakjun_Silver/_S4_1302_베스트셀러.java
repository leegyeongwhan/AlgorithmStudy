package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class _S4_1302_베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        //System.out.println(map);

        //value 값비교
        int max = 0;

        for (String s : map.keySet()) {
            max = Math.max(max, map.get(s));
        }

        //오름 차순 정렬
        List<String> list = new ArrayList<>(map.keySet());
        StringBuffer sb = new StringBuffer();

        Collections.sort(list);
       // System.out.println(list);

        for (String s : list) { //키값들 정렬
            if (map.get(s) == max) {
                sb.append(s).append("\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
