package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.*;

public class G3_4577_소코반 {
    static int target;  // 플레이어,플레이어가 위치한 목표점, 목표점을 3가지를 목표로 0이될떄까지 추적한다.
    static char[][] map;
    static Point player;
    static int raw;
    static int cal;
    //상하좌우
    static final int U = 0, D = 1, L = 2, R = 3;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static int stage = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            target = 0;
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

       //     System.out.println(Arrays.deepToString(map));
//            System.out.println(command);
            printMap();
    //        System.out.println(target);
        }
    }

    private static void printMap() {
        StringBuilder sb = new StringBuilder();
        boolean isComplete = true;

        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < cal; j++) {
                sb.append(map[i][j]);
                if (map[i][j] == '+') {
                    isComplete = false;
                }
            }
            sb.append("\n");
        }
        System.out.println("Game " + (stage++) + ": " + (isComplete ? "complete" : "incomplete") + "\n" + sb);
    }

    private static void commandSetting(String command) {
        final int length = command.length();
        for (int i = 0; i < length && target != 0; i++) {
            switch (command.charAt(i)) {
                case 'U':
                    move(U);
                    break;
                case 'D':
                    move(D);
                    break;
                case 'L':
                    move(L);
                    break;
                case 'R':
                    move(R);
                    break;
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

        switch (map[nx][ny]) {
            case 'B':
            case 'b':
                if (!isPassible(nx, ny, dir)) {
                    return;
                }
            case '.':
            case '+':
                //현재 좌표가 w인지 w인지 확인
                map[player.x][player.y] = map[player.x][player.y] == 'W' ? '+' : '.';
                map[nx][ny] = map[nx][ny] == '.' ? 'w' : 'W';
                //플레이어 좌표 변경
                player.x = nx;
                player.y = ny;
        }
    }

    private static boolean isPassible(int x, int y, int dir) {
        //박스를 밀떄는 박스 다음 칸도 생각해야함.
        //이동 한 다음 좌표 값
        int nx = x + dirX[dir];
        int ny = y + dirY[dir];

        if (map[x][y] == 'B' && map[nx][ny] == '.') {
            target++;
        }
        if (map[x][y] == 'b' && map[nx][ny] == '+') {
            target--;
        }
        //박스 다음 좌표가 밀수 있는 공간이여야함
        if (map[nx][ny] == '.' || map[nx][ny] == '+') {
            //현재 좌표가 w인지 w인지 확인
            map[x][y] = map[x][y] == 'B' ? '+' : '.';
            map[nx][ny] = map[nx][ny] == '.' ? 'b' : 'B';
            return true;
        }
        return false;
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