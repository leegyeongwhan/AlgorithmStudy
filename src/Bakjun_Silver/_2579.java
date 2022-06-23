package Bakjun_Silver;

import java.util.Scanner;

public class _2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //dp[n] = Math.max(dp[n-3] + stairs[n-1], dp[n-2]) + stairs[n]
        int[] stair = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            stair[i] = sc.nextInt();
        }
        int[] score = new int[n + 2];
        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        for (int i = 3; i <= n; i++) {
            score[i] = Math.max(score[i - 3] + stair[i - 1], score[i - 2]) + stair[i];
        }

        System.out.println(score[n]);
    }
}


