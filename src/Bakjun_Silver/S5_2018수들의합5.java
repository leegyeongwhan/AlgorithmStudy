package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_2018수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = 1 + i;
//        }

        int start = 1;
        int end = 1;
        int sum = start + end - 1;
        int cnt = 0;

        while (end <= n && start <= n) {
            if (sum == n) {
                cnt++;
            }
            if (sum > n) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(cnt);
    }
}
