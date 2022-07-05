package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Kim = Integer.parseInt(st.nextToken());
        int Im = Integer.parseInt(st.nextToken());
        int round = 0;

        while (true) {
            round++;

            //라운드에 누가 올라갈지는 중요하지않음.
            Kim = (Kim + 1) / 2;
            Im = (Im + 1) / 2;

            if (Kim == Im) {
                break;
            }
        }
        System.out.println(round);
    }
}
