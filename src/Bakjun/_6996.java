package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            System.out.print(s1 + " & " + s2 + " are ");
            if (!sortStr(s1).equals(sortStr(s2))) {
                System.out.print("NOT ");
            }
                System.out.println("anagrams.");
        }
    }

    public static String sortStr(String str) {
        char[] charr = str.toCharArray();
        Arrays.sort(charr);

        return new StringBuilder(new String(charr)).toString();
    }
}
