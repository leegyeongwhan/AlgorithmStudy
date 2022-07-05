package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> list = new ArrayList<>();


        for (int i = 1; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                //단어 나누기
                StringBuilder front = new StringBuilder();
                StringBuilder mid = new StringBuilder();
                StringBuilder last = new StringBuilder();
                front.append(str.substring(0, i));
                mid.append(str.substring(i, j));
                last.append(str.substring(j, str.length()));

//                System.out.println("front = " + front);
//                System.out.println("mid = " + mid);
//                System.out.println("last = " + last);

                //뒤집기
                front.reverse();
                mid.reverse();
                last.reverse();
//                System.out.println(front);
//                System.out.println(mid);
//                System.out.println(last);
                //합치기
                StringBuilder sum = new StringBuilder();
                sum.append(front).append(mid).append(last);
                String res = sum.toString();
                list.add(res);
            }

        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
