package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 8 방향 탐색을 이용하자
 주의사항 8방향 탐색, 방문 여부를 체크하자 체크한후 true 로 바꿔주자.
 */


public class _S2_4963_섬의개수 {
    static int[][] map;
    static boolean[][] visit;
    static int h;
    static int w;
    //                    12    3      6       9
    static int[] dir8x = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dir8y = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        while (w != 0 && h != 0) {

            map = new int[h][w];
            visit = new boolean[h][w];
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    //map 이섬이면서 방문하지 않았어야함
                    if (map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        System.out.println("dfs" + i + "m" + j);
                        cnt++;
                    }
                }
            }

            //  System.out.println(Arrays.deepToString(map));
            System.out.println(cnt);
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
        }

    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        //8방향 탐색
        for (int i = 0; i < 8; i++) {
            int nx = x + dir8x[i];
            int ny = y + dir8y[i];
            //map에 범위에 벗어나는지 체크
            if (nx < 0 || ny < 0 || nx > h - 1 || ny > w - 1) {
                continue;
            }
            //방문 했는지 체크
            if (visit[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == 1) {
                dfs(nx, ny);
                //System.out.println("dfs(x)=" + nx + "dfs(y)=" + ny);
            }
        }
        System.out.println("_S2_4963_섬의개수.dfs");
        return;
    }
}
