package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941_s5_크로아티아알파벳 {

    public static void main(String[] args) throws IOException {
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < croatia.length; i++) {
            if (str.contains(croatia[i])) {
                str = str.replace(croatia[i], " ");

            }
        }
        //       System.out.println("str = " + str);
        System.out.println(str.length());
    }
}
