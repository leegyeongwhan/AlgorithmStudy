package Bakjun;

import java.util.Scanner;

public class _2592 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] arr = new int[10];
        int[] arr = new int[1001];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            arr[num]++;
            sum += num;
        }

//        int[] cntArr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            int cnt = 0;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    cnt++;
//                }
//            }
//            cntArr[i] = cnt;
//        }
//

//        for (int i = 0; i < cntArr.length; i++) {
//            System.out.println(cntArr[i]);
//        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < 1001; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (max < cntArr[i]) { //가장 큰인덱스 2
//                max = cntArr[i];
//                index = i;
//            }
//        }
        System.out.println(sum / 10);
        System.out.println(arr[index]);
    }
}
