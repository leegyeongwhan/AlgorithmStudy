package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class S2_9020_골드바흐의추측 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[10000];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(arr.length); i++) { // 제곱근 까지만 수행
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j < arr.length; j = j + i) { // 배수 지우기
                arr[j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int p = num / 2;
            int q = num / 2;

            while (true) {
                if (arr[p] != 0 && arr[q] != 0) {
                    sb.append(arr[q] + " " + arr[p]).append("\n");
                    break;
                }
                p++;
                q--;
            }
        }
        System.out.println(sb.toString());
    }
}
