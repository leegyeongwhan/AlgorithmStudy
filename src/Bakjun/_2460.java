package Bakjun;

import java.util.Scanner;

public class _2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[11];
        arr[0] = 0;
        for (int i = 1; i <= 10; i++) {
            int num1 = scanner.nextInt();  //내린사람
            int num2 = scanner.nextInt();  // 탄사람
            arr[i] = arr[i - 1] - num1 + num2;  //n번역
        }
        int max = 0;
        for (int i = 1; i <= 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
