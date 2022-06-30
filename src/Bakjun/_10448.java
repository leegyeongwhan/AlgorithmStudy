package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10448 {
    static int[] arr = new int[46];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 45; i++) {
            arr[i] = i * (i + 1) / 2;
        }

    //    System.out.println(Arrays.toString(arr));
        for (int i = 1; i <= M; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(check(num));
        }
    }

    static int check(int num) {
        int sum = 0;
        for (int j = 1; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                for (int k = 1; k < arr.length; k++) {
                    sum = arr[j] + arr[i] + arr[k];
                    if (sum == num) {
//                        System.out.println("arr[i] = " + arr[i]);
//                        System.out.println("arr[j] = " + arr[j]);
//                        System.out.println("arr[k] = " + arr[k]);
                        return 1;
                    }
                }
            }

        }
        return 0;
    }

}