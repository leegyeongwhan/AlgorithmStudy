package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

public class B1_1236_성지키기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        String[][] map = new String[width][height];

        for (int i = 0; i < width; i++) {
            String input = br.readLine();
            for (int j = 0; j < height; j++) {
                map[i][j] = String.valueOf(input.charAt(j));
            }
        }
        //행 과 열로 구분

        //행
        int row = 0;
        for (int i = 0; i < width; i++) {
            boolean flag = true;
            for (int j = 0; j < height; j++) {
                if (map[i][j].equals("X")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                row++;
            }
        }
        //열
        int cal = 0;
        for (int i = 0; i < height; i++) {
            boolean flag = true;
            for (int j = 0; j < width; j++) {
                if (map[j][i].equals("X")) {
                    flag = false;

                    break;
                }
            }
            if (flag) {
                cal++;
            }
        }
        System.out.println(Math.max(row, cal));
    }
}
