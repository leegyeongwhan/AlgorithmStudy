package Bakjun;

import java.util.Scanner;

public class B3_2446_별찍기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        //두파트로 나눠서 하자
        // 역삼각형 코드
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 삼각형 코드
        for (int i = 0; i < N - 1; i++) {

            // 공백
            for (int j = 1; j < (N - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
