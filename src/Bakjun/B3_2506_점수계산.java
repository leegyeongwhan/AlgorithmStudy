package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2506_점수계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else if (arr[i] == 0) {
                cnt = 0;
            }
            sum += cnt;
        }
        System.out.println(sum);
    }
}
