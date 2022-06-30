package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1018 {
    static boolean[][] board = new boolean[8][8];


    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for (int k = 0; k < N; k++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[k][j] = true;
                } else if (str.charAt(j) == 'B') {
                    board[k][j] = false;
                }
            }
        }
////// 2*(M - 7) * (N - 7) 경우의수
        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                check(i, j);
            }
        }
        System.out.println(min);
    }

    static void check(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

// 첫 번째 칸의 색
        boolean check = board[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {

                // 올바른 색이 아닐경우 count 1 증가
                if (board[i][j] != check) {
                    count++;
                }
                check = (!check);
            }

            check = !check;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}

