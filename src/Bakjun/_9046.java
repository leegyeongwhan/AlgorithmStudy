package Bakjun;

import java.util.Arrays;
import java.util.Scanner;

public class _9046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int max = 0;
            int index = 0;
            int cnt = 0;

            String res = sc.nextLine();
            //  System.out.println("res = " + res);
            res = res.replaceAll(" ", "");
            //       System.out.println("str = " + res);
            int[] cntArr = new int[26];

            for (int j = 0; j < res.length(); j++) {

                cntArr[res.charAt(j) - 'a']++;
            }


            for (int j = 0; j < cntArr.length; j++) {
                if (cntArr[j] > max) {
                    max = cntArr[j];
                    index = j;
                }
            }

            for (int j = 0; j < cntArr.length; j++) {
                if (cntArr[j] == max) {
                    cnt++;
                }
            }

            if (cnt > 1) {
                char ch = '?';
                sb.append(ch).append("\n");
            } else {
                char ch = (char) (index + 'a');
                sb.append(ch).append("\n");
            }
        }
        System.out.println(sb);
    }
}
