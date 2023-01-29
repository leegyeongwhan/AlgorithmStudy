package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1331_나이트투어 {
    static boolean[][] visit = new boolean[6][6];
    static int[] dirX = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dirY = {2, 1, -1, -2, -2, -1, 1, 2};
    static boolean flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        final int final_X = s.charAt(0) - 'A';
        final int final_Y = s.charAt(1) - '1';
        //처음 좌표를 까먹으면안됨 처음 좌표와 마지막 좌표를 비교해야함
        visit[final_X][final_Y] = true;

        int x = final_X;
        int y = final_Y;

        for (int i = 0; i < 35; i++) {
            String str = br.readLine();
            int lx = str.charAt(0) - 'A';
            int ly = str.charAt(1) - '1';

            flag = false;

            for (int j = 0; j < 8; j++) {
                int nx = x + dirX[j];
                int ny = y + dirY[j];

                if (nx < 0 || nx > 5 || ny < 0 || ny > 5) continue;
                if (lx == nx && ly == ny && visit[nx][ny] == false) {
                    visit[lx][ly] = true;
                    flag = true;
                    break;
                }
            }

            if (flag) { //좌표변경
                x = lx;
                y = ly;
            } else {
                System.out.println("Invalid");
                return;
            }
        }

        //마지막조건
        flag = false;
        for (int i = 0; i < 8; i++) {
            if ((x + dirX[i]) == final_X && (y + dirY[i]) == final_Y) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
