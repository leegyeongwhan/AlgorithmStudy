package Bakjun_Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 적녹 색맹은 r g를 같이봄
public class G5_10026_적록색약 {

    static char[][] map;
    static boolean[][] visit;
    static int n;
    static int[] dirX = {-1, 0, 1, 0};
    static int[] dirY = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int k = 0; k < n; k++) {
                map[i][k] = input.charAt(k);
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        int normalCnt = cnt;
        cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'R') {
                    map[i][j] = 'G';
                }
            }
        }

        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(normalCnt + " " + cnt);
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        int nx = 0;
        int ny = 0;
        char color = map[x][y];  //죄표 값의 색을 받아온다

        for (int i = 0; i < 4; i++) {
            nx = x + dirX[i];
            ny = y + dirY[i];

            if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) {
                continue;
            }

            if (!visit[nx][ny] && map[nx][ny] == color) {
                visit[nx][ny] = true;
                dfs(nx, ny);
            }
        }

    }
}
