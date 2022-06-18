package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class _2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }
            String[] arr = new String[input];
            for (int i = 0; i < input; i++) {
                arr[i] = br.readLine();
            }

            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareToIgnoreCase(o2);
                }
            });
            sb.append(arr[0]).append("\n");
        }
        System.out.println(sb);
    }
}
