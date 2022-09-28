package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10103_주사위게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int ascore = 100;
        int bscore = 100;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A > B) {
                bscore -= A;
            } else if (A < B) {
                ascore -= B;
            }
        }
        System.out.println(ascore + "\n" + bscore);
    }
}
