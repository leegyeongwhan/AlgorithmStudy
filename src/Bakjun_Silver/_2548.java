package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2548 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        // Arrays.sort(arr);
        int[] sumArr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }
            sumArr[i] = sum;
        }

        // Arrays.sort(sumArr);

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sumArr));
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sumArr[i] > sumArr[j]) {
                    int tmp = sumArr[i];
                    sumArr[i] = sumArr[j];
                    sumArr[j] = tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sumArr));

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (sumArr[0] == sumArr[i]) {
                min = Math.min(arr[i], min);
            }
        }
        System.out.println(min);


    }
}
