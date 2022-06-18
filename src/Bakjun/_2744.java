package Bakjun;

import java.util.Scanner;

public class _2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= arr[i] && arr[i] <= 'z') {
                arr[i] -= 32;
            } else {
                arr[i] += 32;
            }
        }
        for (char c : arr){
            System.out.print(c);
        }
    }
}
