package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _G5_14503_로봇청소기 {
    static int[][] map;
    //북서 남동 반시계반향 좌표가 후진했을때 좌표에 계산해야할 값들의 배열
    static int[][] dirArr = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //   System.out.println(Arrays.deepToString(map));

        Cleaner cl = new Cleaner(r, c, d);
        //청소 시작
        cl.clean(r, c);

        Outer:
        while (true) {
            //시작 한후 방향을 탐색한다
            for (int i = 0; i < dirArr.length; i++) {
                cl.turn();
                //현재 좌표가 청소가 가능한가?
                int preRaw = cl.row + dirArr[cl.dir][0];
                int preCal = cl.cal + dirArr[cl.dir][1];

                if (map[preRaw][preCal] == 0) {
                    cl.clean(preRaw, preCal);
                    //성공 했다면 나머지 회전 할 필요 없음
                    continue Outer;
                }
            }
            // for 문을 통과 즈 4번 회전해도 방법없음 -> 후진 가능 여부 체크
            if (!cl.back()) {
                break Outer;
            }
        }
        System.out.println(cl.answer);
    }


    //로봇 클래스는 현재 좌표,현재 방향을 가진다, 1.반시계 방향으로 회전 2,청소 할 수 있다(int). 3후진 할 수 있다(bool).
    static class Cleaner {
        int row = 0;
        int cal = 0;
        int dir = 0;
        int answer = 0;

        public Cleaner(int row, int cal, int dir) {
            this.row = row;
            this.cal = cal;
            this.dir = dir;
        }

        //로봇은 반시계 방향으로 돈다
        public void turn() {
            dir--;
            if (dir == -1) {
                dir = 3;
            }
        }

        //청소를 해준후 점수를 플러스 한다. 청소한 곳은 구분 짓기위해 2를 넣어준다
        public void clean(int row, int cal) {
            this.row = row;
            this.cal = cal;
            map[row][cal] = 2;
            answer++;
        }

        //돌기에 실패했으면 후진해야 한다 후진 가능 한지 따져본다.
        public boolean back() {
            //현재 위치를 주기때문에 후진 한 값이 1이면 벽이기때문에 실패
            this.row -= dirArr[this.dir][0];
            this.cal -= dirArr[this.dir][1];
            if (map[this.row][this.cal] == 1) {
                return false;
            }
            return true;
        }
    }
}
