package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3085 {
    static int max = 0;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 1; j < board.length; j++) {
                char tmp = board[i][j];
                board[i][j] = board[i][j - 1];
                board[i][j - 1] = tmp;
                //     System.out.println(Arrays.deepToString(board));
                check(board);
                tmp = board[i][j];
                board[i][j] = board[i][j - 1];
                board[i][j - 1] = tmp;
                //      System.out.println("chagne=" + Arrays.deepToString(board));

            }
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 1; j < board.length; j++) {
                char tmp = board[j][i];
                board[j][i] = board[j - 1][i];
                board[j - 1][i] = tmp;
                check(board);
                tmp = board[j][i];
                board[j][i] = board[j - 1][i];
                board[j - 1][i] = tmp;
                // System.out.println("chagne=" + Arrays.deepToString(board));
            }
        }
        System.out.println(max);
        //System.out.println(Arrays.deepToString(board));
        //가로 세로 확인

    }

    static void check(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            int cnt = 1;
            for (int j = 1; j < board.length; j++) {
                if (board[i][j] == board[i][j - 1]) {
                    cnt++;
                    // System.out.println("chagne=" + Arrays.deepToString(board));
                } else {
                    cnt = 1;
                }
                max = Math.max(cnt, max);
            }
        }

        for (int i = 0; i < board.length; i++) {
            int cnt = 1;
            for (int j = 1; j < board.length; j++) {
                if (board[j - 1][i] == board[j][i]) {
                    cnt++;
                    //   System.out.println("chagne=" + Arrays.deepToString(board));
                } else {
                    cnt = 1;
                }
                max = Math.max(cnt, max);
            }
        }
    }
}
