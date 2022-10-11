package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
        }
///////배열의 길이를 구해준다
//        List<Integer> IntegerList = new ArrayList<Integer>();
//        for (int i = 0; i < list.size(); i++) {
//            IntegerList.add(list.get(i).length());
//        }
////선택정렬을 사용하여 내림차순 정렬
//        for (int i = 0; i < list.size() - 1; i++) {
//            int minlenIndex = IntegerList.get(i); // but 길이가 3
//            for (int j = i + 1; j < list.size(); j++) {
//                if (IntegerList.get(j) < IntegerList.get(minlenIndex)) {
//                    minlenIndex = j;
//                }
//            }
//            int tmp = IntegerList.get(i);
//            IntegerList.set(i, IntegerList.get(minlenIndex));
//            IntegerList.set(minlenIndex, tmp);
//        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);  //사전순
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });
        System.out.println(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                continue;
            }
            System.out.println(list.get(i));
        }
    }
}