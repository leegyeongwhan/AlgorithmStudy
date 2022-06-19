package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            arr[br.readLine().charAt(0) - 'a']++;
        }
     //   System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                char ch = (char) (i + 'a');
                sb.append(ch);
                flag = true;
            }
        }
        if (flag == false) {
            sb.append("PREDAJA");
        }
        System.out.println(sb);
    }
}