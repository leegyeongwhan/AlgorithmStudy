package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class _3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] chanelArr = new int[n];


        for (int i = 0; i < n; i++) {
            int chanel = Integer.parseInt(br.readLine());
            chanelArr[i] = chanel;
        }

        int min = 0;
        for (int i = 0; i < chanelArr.length; i++) {
            if (Math.abs(B - chanelArr[min]) > Math.abs(B - chanelArr[i])) {
                min = i;
            }
        }

        int res = 0;
        if (Math.abs(B - chanelArr[min]) >= 0) {
            cnt = 1;
        }
        cnt += Math.abs(B - chanelArr[min]);

        int abs = 0;
        abs = Math.abs(A - B);
        res = Math.min(abs, cnt);
        System.out.println(res);
    }
}
