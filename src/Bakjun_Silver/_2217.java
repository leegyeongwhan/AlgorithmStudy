package Bakjun_Silver;

import java.util.Arrays;
import java.util.Scanner;

public class _2217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            arr[i] = k;
        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];  //끝 값을 max값으로 오름차순을 정렬!!
        //각각 의 값들로 max를 판별하자
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i] * (arr.length - i));
        }
        System.out.println(max);

    }
}
