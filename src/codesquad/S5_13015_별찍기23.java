package codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S5_13015_별찍기23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int input = Integer.parseInt(br.readLine());
        int n = 4 * (input - 1) + 1; //별의 갯수 점화식
        String[][] map = new String[n][n];
        int index = 0;

        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], " ");
        }

        for (int i = 0; i < input; i++) { //입력값만큼 박스를 그린다
            for (int j = index; j < n - index; j++) { // 박스4방향을 나눠저장한다
                map[index][j] = "*"; //상단 가로
                map[j][index] = "*";  //왼쪽 기둥
                map[j][n - index - 1] = "*"; //오른쪽 기둥
                map[n - index - 1][j] = "*"; //하단 가로
            }
            index += 2;
        }

        StringBuilder sb = new StringBuilder();
        for (String[] chars : map) {
            for (String aChar : chars) {
                sb.append(aChar);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
