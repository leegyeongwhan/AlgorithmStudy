package Bakjun_Silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class _9237 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//
//        for (int i = 0; i < n - 1; i++) {  //내림차순정렬
//            int max = 0;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[max]) {
//                    int tmp = arr[i];
//                    arr[]
//                }
//            }
//            System.out.println("arr = " + arr[i]);
//        }

        Arrays.sort(arr, Collections.reverseOrder());
        int result = 0;
        //System.out.println("arr = " + arr[0]);

        for (int i = 0; i < arr.length; i++) {
            result = Math.max(result, arr[i] + i + 1);
            //자라는데 걸리는 시간 + 일수 + 나무심는데 걸리는 시간
        }
        result = result + 1;
        // 맨 첫번째 행렬이 가장 심는데 오래걸리는 날
        System.out.println(result);
    }
}