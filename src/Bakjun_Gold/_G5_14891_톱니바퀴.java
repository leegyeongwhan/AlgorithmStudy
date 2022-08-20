package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _G5_14891_톱니바퀴 {
    static int[][] map;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map = new int[4][8];
        //톱니바퀴 저장
        for (int i = 0; i < 4; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        //   System.out.println(Arrays.deepToString(map));
        //규칙
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int turn = Integer.parseInt(st.nextToken());

            init(number, turn);
        }
        solution();
        System.out.println(sum);
    }

    private static int solution() {
        sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += map[i][0] * (1 << i);
        }
        return sum;
    }

    // numbere=톱니 turn =1시계방향 -1 반시계방향
    // 톱니가 돌아가는건 톱니가 돌아가기전 결정된다.
    // 주어진 톱니로부터 오른쪽 왼족 톱니들이 회전 할 수 있는지 체크한다.
    private static void init(int number, int turn) {
        leftCheck(number - 1, -turn);
        rightCheck(number + 1, -turn);
        turnning(number, turn);
    }

    private static void rightCheck(int number, int turn) {
        if (number > 3) {
            return;
        }
        //
        if (map[number][6] != map[number - 1][2]) {
            rightCheck(number + 1, -turn);
            turnning(number, turn);
        }

    }

    private static void leftCheck(int number, int turn) {
        if (number < 0) {
            return;
        }
        if (map[number][2] != map[number + 1][6]) {
            leftCheck(number - 1, -turn);
            turnning(number, turn);
        }
    }

    private static void turnning(int number, int turn) {
        if (turn == 1) {
            shif(number);
        } else if (turn == -1) {
            unShif(number);
        }
    }


    private static void shif(int number) {
        int tmp = map[number][7];

        for (int i = 7; i > 0; i--) {
            map[number][i] = map[number][i - 1];
        }
        map[number][0] = tmp;
      //  System.out.println("o" + Arrays.deepToString(map));

    }

    private static void unShif(int number) {
        int tmp = map[number][0];

        for (int i = 0; i > 7; i++) {
            map[number][i] = map[number][i + 1];
        }
        map[number][7] = tmp;
      //  System.out.println("un" + Arrays.deepToString(map));
    }
}
