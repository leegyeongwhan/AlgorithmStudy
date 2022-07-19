package Bakjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1100_하얀칸 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] map = new boolean[8][8];
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {  //행이 짝일떄
                    if (j % 2 == 0) {
                        if (str.charAt(j) == 'F') {
                            cnt++;
                        }
                    }
                } else {
                    if (i % 2 == 1) {  //행이 짝일떄
                        if (j % 2 == 1) {
                            if (str.charAt(j) == 'F') {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        //하얀칸을
      //  System.out.println(Arrays.deepToString(map));
        System.out.println(cnt);
    }
}
