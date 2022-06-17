package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        s1 = s1.replaceAll("[0-9]", "");
        StringBuilder sb = new StringBuilder();
        if (s1.contains(s2)) {
            sb.append(1);
        } else {
            sb.append(0);
        }
        System.out.println(sb);
    }
}
