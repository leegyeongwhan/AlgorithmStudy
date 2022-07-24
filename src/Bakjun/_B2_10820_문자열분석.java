package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _B2_10820_문자열분석 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int i = 0; i < str.length(); i++) {
                if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') { //대문자
                    a++;
                } else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                    b++;
                } else if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                    c++;
                } else {
                    d++;
                }
            }
            System.out.println(a + " " + b + " " + c + " " + d);
        }

    }
}
