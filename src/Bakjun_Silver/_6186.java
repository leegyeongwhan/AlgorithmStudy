package Bakjun_Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//완전 탐색으로 포커싱을잡아보자
// vistit 방문 여부 arr 저어진 배열
public class _6186 {

    static boolean[][] visit;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        visit = new boolean[101][101];
        arr = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = (str.charAt(j) == '#') ? true : false;
            }
        }

        int cnt = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == true && visit[i][j] == false) { //#이면서 방문하지 않은 친구
                    cnt++;
                    bf(i, j, arr);  //탐색
                }
            }
        }
        System.out.println(cnt);
    }

    static void bf(int row, int col, boolean[][] arr) {
        if (arr[row][col] == true && !visit[row][col]) {
            visit[row][col] = true;
            // 상 하 좌 우 탐색
            if (row - 1 > 0 && check(row - 1, col, arr)) {
                bf(row - 1, col, arr);

            }
            if (row + 1 < arr.length && check(row + 1, col, arr)) {
                bf(row + 1, col, arr);

            }
            if (col - 1 > 0 && check(row, col - 1, arr)) {
                bf(row, col - 1, arr);

            }
            if (col + 1 < arr[row].length && check(row, col + 1, arr)) {
                bf(row, col + 1, arr);

            }
        }
    }

    private static boolean check(int row, int col, boolean[][] arr) {
        if (arr[row][col] == true) {
            return true;
        }
        return false;
    }

}

