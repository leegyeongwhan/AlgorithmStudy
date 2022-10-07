package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_11729_하노이탑이동순서 {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        int res = (int) (Math.pow(2, n) - 1);

        System.out.println(res);
        hanoiSub(n, 1, 3);
        System.out.println(sb);
    }

    private static void hanoiSub(int n, int from, int to) {
        hanoi(n, from, to, 2);
    }

    //from 출발지 to 목적지 other 경유지
    private static void hanoi(int n, int from, int to, int other) {
        if (n == 1) {
            move(1, from, to); // 맨밑 원반을 목적지로 이동  //move            return;
        } else {
            hanoi(n - 1, from, other, to);  //맨밑 원반 빼고 다른곳으로 other 로이동
            move(n, from, to); // 맨밑 원반을 목적지로 이동  //move
            hanoi(n - 1, other, to, from);   // 나  머지 원반을 목적지로 쌓아준다
        }
    }

    private static void move(int n, int from, int to) {
        sb.append(from + " " + to + "\n");
    }
}


