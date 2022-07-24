package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _S3_11478_서로다른부분문자열의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        int last = 1;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int start = 0;
            for (int j = 0; j < str.length() - i; j++) {
                String st = str.substring(start, start + last);
//                System.out.println(st);
                set.add(st);
                start++;
            }
            last++;
        }
        System.out.println(set.size());
    }
}
