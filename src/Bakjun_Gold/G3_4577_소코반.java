package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class G3_4577_소코반 {
    static int target;  // 플레이어,플레이어가 위치한 목표점, 목표점을 3가지를 목표로 0이될떄까지 추적한다.
    static char[][] map;
    static char[] command;
    static Point player;
    static int R;
    static int C;
    //상하좌우
    static int[] dirX = {0, -1, 0, 1};
    static int[] dirY = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (R == 0 && C == 0) {
                break;
            }
            map = new char[R][C];

            for (int i = 0; i < R; i++) {
                map[i] = br.readLine().toCharArray();
                for (int j = 0; j < C; j++) {
                    switch (map[i][j]) {
                        case 'W':
                            target++;
                        case 'w':
                            player = new Point(i, j);
                            break;
                        case '+':
                            target++;
                            break;
                    }
                }
            }
            String command = br.readLine();

            System.out.println(Arrays.deepToString(map));
            System.out.println(command);
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}