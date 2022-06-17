package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(":");
        int gccN = gcc(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));

        System.out.println(Integer.parseInt(arr[0]) / gccN + ":" + Integer.parseInt(arr[1]) / gccN);
    }

    public static int gcc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = Integer.parseInt(String.valueOf(r));
        }
        return a;
    }
}
