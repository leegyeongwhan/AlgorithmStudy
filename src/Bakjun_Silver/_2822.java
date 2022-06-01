package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[8][2];  // 0 점수 1 문제 번호

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = Integer.parseInt(br.readLine()); //점수
            arr[i][1] = i + 1;       //번호
        }


        Arrays.sort(arr, (int[] a, int[] b) -> {
            return b[0] - a[0];
        });


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//                System.out.println();
//            }
//        }

        int sum = 0;
        int[] resut = new int[5];
        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            resut[i] = arr[i][1];
        }

        Arrays.sort(resut);
        System.out.println(sum);
        for (int i = 0; i < 5; i++) {
            System.out.print(resut[i] + " ");
        }
    }


}
