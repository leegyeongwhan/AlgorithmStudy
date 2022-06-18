package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }


        //////////////// 팬린드롬이 올 수 도있다!!
        StringBuilder sb2 = null;
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = 0; j < strArr.length; j++) {
                StringBuilder sb = new StringBuilder();
                String st = String.valueOf(sb.append(strArr[i]).reverse());
                if (strArr[j].equals(st)) {
                    System.out.println(st.length() + " " + st.charAt(st.length() / 2));
                    return;
                }
            }
        }

    }
}
