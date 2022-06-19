package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String smileFace = ":-\\)";
        String sadFace = ":-\\(";

        int happyCount = str.split(smileFace, -1).length - 1;
        int sadCount = str.split(sadFace, -1).length - 1;

        if (happyCount > sadCount) {
            System.out.println("happy");
        } else if (sadCount > happyCount) {
            System.out.println("sad");
        } else if (happyCount == 0 && sadCount == 0) {
            System.out.println("none");
        } else if (happyCount == sadCount) {
            System.out.println("unsure");
        }
    }
}
