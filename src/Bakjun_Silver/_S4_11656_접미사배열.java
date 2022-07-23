package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _S4_11656_접미사배열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();


        String[] arr = new String[name.length()];
        String str = "";
        for (int i = 0; i < name.length(); i++) {
            str = name.substring(i);
            arr[i] = str;
        }
        //   System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
