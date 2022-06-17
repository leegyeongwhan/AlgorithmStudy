package Bakjun_Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14405 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String result = "";

        result = str.replaceAll("pi|ka|chu", "");


        if (result.equals("")) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }
        System.out.println(sb);
    }
}
