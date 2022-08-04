package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1_11005_진법변환2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[] arr = new char[36];

        for (int i = 0; i < 10; i++) {
            arr[i] = (char) (i + '0');
        }

        for (int i = 10; i < 36; i++) {
            arr[i] = (char) (i + 'A' - 10);
        }
        long res = 0;
        String str = "";

        while (n > 0) {
            res = n % m;
            n = n / m;
            str = arr[(int) res] + str;
        }
        System.out.println(str);
    }
}
