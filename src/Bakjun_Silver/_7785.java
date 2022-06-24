package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(sc.nextToken());

        //  HashMap<String, String> map = new HashMap<>();


        Set<String> memberSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });


        for (int i = 0; i < n; i++) {
            sc = new StringTokenizer(br.readLine());
            String name = sc.nextToken();
            String str = sc.nextToken();
            if (str.equals("enter")) {
                memberSet.add(name);
            } else {
                memberSet.remove(name);
            }
            //  map.put(name, str);
        }

        StringBuilder sb = new StringBuilder();

        for(String member : memberSet){
            sb.append(member).append("\n");
        }
        System.out.println(sb.substring(0, sb.length()-1));
        System.out.println("차이");
        System.out.println(sb);
//        List<String> name = new ArrayList<>();
//        for (Map.Entry<String, String> map1 : map.entrySet()) {
//            if (map1.getValue().equals("enter")) {
//                name.add(map1.getKey());
//            }
//        }
//        name.sort(Comparator.reverseOrder());
//        for (String s : name) {
//            System.out.println(s);
//        }
    }
}
