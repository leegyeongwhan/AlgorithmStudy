package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G3_4577_소코반 {
    static int target;  // 플레이어,플레이어가 위치한 목표점, 목표점을 3가지를 목표로 0이될떄까지 추적한다.
    static char[][] map;
    static char[] cmd;
    static Point player;
    static int raw;
    static int cal;
    //상하좌우
    static final int U = 0, D = 1, L = 2, R = 3;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(input.readLine());
            raw = Integer.parseInt(st.nextToken());
            cal = Integer.parseInt(st.nextToken());

            if (isImpassibleInput()) {
                break;
            }
            map = new char[raw][cal];
            mapSetting(input);

            String command = input.readLine();
            commandSetting(command);

            System.out.println(Arrays.deepToString(map));
            System.out.println(command);
        }
    }

    private static void commandSetting(String command) {
        final int length = command.length();
        for (int i = 0; i < length; i++) {
            switch (command.charAt(i)) {
                case 'U':
                    move(U);
                case 'D':
                    move(D);
                case 'L':
                    move(L);
                case 'R':
                    move(R);
            }
        }
    }

    private static void mapSetting(BufferedReader br) throws IOException {
        for (int i = 0; i < raw; i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < cal; j++) {
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
    }

    private static boolean isImpassibleInput() {
        if (raw == 0 && cal == 0) {
            return true;
        }
        return false;
    }

    private static void move(int dir) {
        int nx = player.x + dirX[dir];
        int ny = player.y + dirY[dir];


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