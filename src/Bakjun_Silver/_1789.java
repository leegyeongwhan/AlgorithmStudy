package Bakjun_Silver;

import java.util.Scanner;

public class _1789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
//        long sum = 0;
//        long max = 0;
//        long i = 1;
//
//        while (true) {
//            sum += i;
//            if (sum > n) {
//                break;
//            }
//            max = i;
//            i++;
//        }
        long min = 1;
        long max = n;
        long mid = 0;

        while (min < max) {
            mid = (min + max + 1) / 2;
            System.out.println("mid = " + mid);
            if ((mid * (mid + 1) / 2) <= n) {
                System.out.println("(mid * (mid + 1)) = " + (mid * (mid + 1)));
                min = mid;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
