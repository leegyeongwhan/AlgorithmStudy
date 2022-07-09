package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = getMinNum(arr);
        System.out.println(bf(min));
    }

    private static int bf(int min) {
        int sum = 0;
        boolean[] arr = checked(min);
        for (int i = 1111; i < min; i++) {
            if (arr[i]) {
                sum++;
            }

        }
        return sum + 1;
    }

    ///////시계화
    public static void shift(int[] arr) {
        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = tmp;
    }


    //////////////가능한 모든 수를 시계화
    public static boolean[] checked(int min) {
        boolean[] visit = new boolean[10000];
        int[] arr = new int[4];
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        arr[0] = a;
                        arr[1] = b;
                        arr[2] = c;
                        arr[3] = d;
                        int n = getMinNum(arr);

                        if (!visit[n]) {
                            visit[n] = true;
                        }
                    }
                }
            }
        }

        return visit;
    }

    /////////////// 시계화 된 수 중 가장작은수 찾기
    private static int getMinNum(int[] arr) {
        int min = (arr[0] * 1000) + (arr[1] * 100) + (arr[2] * 10) + (arr[3]); //첫번째 수
        for (int i = 0; i < arr.length; i++) {
            int n = 0;
            shift(arr);
            // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            for (int j = 0; j < arr.length; j++) {
                n = (arr[0] * 1000) + (arr[1] * 100) + (arr[2] * 10) + (arr[3]);
            }
            //   System.out.println("n = " + n);
            min = Math.min(n, min);
            //  System.out.println("min = " + min);
        }

        return min;
    }
}
