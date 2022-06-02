package Bakjun_Silver;

import java.util.Arrays;
import java.util.Scanner;

public class _16435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= L) {
                L++;
            }
        }
        System.out.println( L);
    }
}
