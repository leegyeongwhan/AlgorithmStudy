package codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단 {
    public static void main(String[] args) throws IOException {

        for (int i = 2; i <= 9; i++) {
            System.out.print(" " + i + "단 " + "      ");
        }
        System.out.println();
        for (int k = 1; k <= 9; k++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " x " + k + "     ");
            }
            System.out.println();
        }
    }
}






















