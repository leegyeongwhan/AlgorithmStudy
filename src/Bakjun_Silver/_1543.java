package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String str = br.readLine();
        int cnt = 0;
        String diff = "";

        for (int i = 0; i < n.length(); i++) {
            diff += String.valueOf(n.charAt(i));
            if (diff.contains(str)) {
                diff = diff.replaceAll(str, " ");
                cnt++;
            }
        }


        /*
        for(;n.indexOf(str)>=0; cnt++) {
			n = n.substring(n.indexOf(str)+str.length(), n.length());
		}
         */

        System.out.println(cnt);
    }
}
