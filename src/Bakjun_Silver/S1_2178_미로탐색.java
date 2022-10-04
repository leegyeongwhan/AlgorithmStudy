package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_2178_미로탐색 {
    //4방향탐색
    static int[][] map;
    static int[][] dis;
    static boolean[][] visit;
    static int width;
    static int height;
    static int[] dirX = {1, 0, -1, 0};
    static int[] dirY = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());
        map = new int[height][width];
        dis = new int[height][width];
        visit = new boolean[height][width];

        for (int i = 0; i < height; i++) {
            String input = br.readLine();
            for (int j = 0; j < width; j++) {
                map[i][j] = input.charAt(j) - 48;
            }
        }
        dis[0][0] = 1;
        bfs(0, 0);


        System.out.println(dis[height - 1][width - 1]);
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visit[x][y] = true;

        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dirX[i];
                int ny = tmp.y + dirY[i];

                if (nx < 0 || ny < 0 || nx > height - 1 || ny > width - 1 || visit[nx][ny]) {
                    continue;
                }

                if (!visit[nx][ny] && map[nx][ny] == 1) {
                    visit[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
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
