package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1_2667_단지번호붙이기 {
    static boolean[][] visit;
    static int[][] map;
    static int[] dirArrx = {0, 0, 1, -1};
    static int[] dirArry = {1, -1, 0, 0};
    static int num;
    private static int[] aparts;
    private static int apartNum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        num = Integer.parseInt(br.readLine());
        map = new int[num][num];
        visit = new boolean[num][num];
        aparts = new int[num * num];

        for (int i = 0; i < num; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < num; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        int cnt = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    dfs(i, j);
                    // System.out.println("dfs" + i + "m" + j);
                    apartNum++;
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] == 0) {
            } else {
                System.out.println(aparts[i]);
            }
        }
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dirArrx[i];
            int ny = y + dirArry[i];

            if(nx >=0 && ny >=0 && nx < num && ny < num){
                if(map[nx][ny] == 1 && !visit[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}
