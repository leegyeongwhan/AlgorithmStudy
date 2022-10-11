package Bakjun;

import java.beans.PropertyEditorSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2851 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] mush = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            mush[i] = num;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int diff = 100;
        int result = 0;
        int sum = 0;


        for (int i = 0; i < 10; i++) {
            sum += mush[i];


            if (sum == 100) {
                result = sum;
                break;
            }


            if (sum > 100) {
                int preScore = Math.abs(diff - sum);
                int pastScore = Math.abs(diff - result);
                System.out.println("preScore = " + preScore);
                System.out.println("pastScore = " + pastScore);
                System.out.println("sum = " + sum);
                if (preScore >= pastScore) {
                    result = sum;
                }
                break;
            }
        }
        System.out.println(result);
    }
}
