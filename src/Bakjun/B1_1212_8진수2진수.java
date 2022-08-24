package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1212_8진수2진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] eightChange = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            sb.append(eightChange[n]);
        }
        //0일때
        if (str.equals("0")) {
            System.out.println(str);
        } else {
            while (sb.charAt(0) == '0') {
                sb = new StringBuilder(sb.substring(1));
            }
            System.out.println(sb);
        }
    }
}
