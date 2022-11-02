package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10214_베이스볼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());


        for (int j = 0; j < n; j++) {
            int Ysum = 0;
            int Ksum = 0;
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                int Y = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());
                Ysum += Y;
                Ksum += K;
            }

            if (Ysum > Ksum) {
                System.out.println("Yonsei");
            } else if (Ysum == Ksum) {
                System.out.println("Draw");
            } else {
                System.out.println("Korea");
            }
        }
    }
}
