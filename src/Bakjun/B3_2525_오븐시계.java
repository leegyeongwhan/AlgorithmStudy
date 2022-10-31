package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2525_오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int input = Integer.parseInt(br.readLine());

        int min = (60 * hour) + minute;
        min += input;
        hour = (min / 60) % 24;
        minute = min % 60;
        System.out.println(hour + " " + minute);
    }
}
