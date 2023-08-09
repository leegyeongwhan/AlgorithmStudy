package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_21610_마법사상어와비바라기 {
    static int[][] map;
    static boolean[][]  visit;

    static int[] dirX = {0, 0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dirY = {0, -1, -1, 0, 1, 1, 1, 0, -1};
    static Queue<Cloud> clouds = new LinkedList<>();
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clouds.add(new Cloud(N - 1, 0));
        clouds.add(new Cloud(N - 1, 1));
        clouds.add(new Cloud(N - 2, 0));
        clouds.add(new Cloud(N - 2, 1));

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            move(d, s);
            remove();
            count();
        }
    }

    private static void count() {

    }

    private static void remove() {
        while (!clouds.isEmpty()) {
            Cloud cloud = clouds.poll();
            int cnt = 0;

            visit[cloud.x][cloud.y] = true;
            for (int i = 1; i <= 7; i += 2) {
                int nx = cloud.x + dx[i];
                int ny = cloud.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (map[nx][ny] >= 1)
                        cnt++;
                }

            }
            map[cloud.x][cloud.y] += cnt;

        }
    }

    private static void move(int d, int s) {
        for (Cloud cloud : clouds) {
            cloud.x = (N + cloud.x + dirX[d] * (s % N)) % n;
            cloud.y = (N + cloud.y + dirY[d] * (s % N)) % n;
        }
    }

    static class Cloud {
        int x;
        int y;

        public Cloud(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
