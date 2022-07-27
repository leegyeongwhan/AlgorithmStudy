package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _B2_1453_피시방알바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[101];
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (arr[n] == true) {
                cnt++;
            } else {
                arr[n] = true;
            }
        }
        System.out.println(cnt);
    }
}
