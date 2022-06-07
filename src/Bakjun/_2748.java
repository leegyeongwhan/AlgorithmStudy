package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2748 {
    static long[] arr = new long[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        System.out.println(fivo(num));
    }
    static long fivo(int num) {
        if (num == 1) return 1;
        if (num == 2) return 1;
        if (arr[num] != 0) return arr[num];
        return arr[num] = fivo(num - 2) + fivo(num - 1);
    }
}
