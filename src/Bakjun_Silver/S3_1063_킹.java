package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 움직이는 메서드 move 와 킹이 움직일수있는지 여부를 체크하는 validation 메서드로구성
 */
public class S3_1063_킹 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] king = st.nextToken().toCharArray();
        char[] stone = st.nextToken().toCharArray();

        int num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            //깊은복사를 통해전달 안움직이는 경우도 있기 때문
            char[] next_king = king.clone();
            char[] next_stone = stone.clone();
            move(input, next_king);
            if (validation(next_king)) {
                continue;
            }
            if (Arrays.equals(next_king, next_stone)) { //둘의 위치가같으면
                move(input, next_stone);
                if (validation(next_stone)) {
                    continue;
                }
            }
            king = next_king;
            stone = next_stone;
        }
        System.out.println(king);
        System.out.println(stone);
    }

    private static boolean validation(char[] next) {
        boolean b = next[0] < 'A' || next[0] > 'H' || next[1] < '1' || next[1] > '8';
        return b;
    }

    private static void move(String input, char[] next) {
        switch (input) {
            case "R":
                next[0]++;
                break;
            case "L":
                next[0]--;
                break;
            case "B":
                next[1]--;
                break;
            case "T":
                next[1]++;
                break;
            case "RT":
                next[0]++;
                next[1]++;
                break;
            case "LT":
                next[0]--;
                next[1]++;
                break;
            case "RB":
                next[0]++;
                next[1]--;
                break;
            case "LB":
                next[0]--;
                next[1]--;
                break;
        }
    }
}
