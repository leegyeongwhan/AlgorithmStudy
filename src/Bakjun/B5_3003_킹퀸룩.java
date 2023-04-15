package Bakjun;

import java.util.Scanner;

public class B5_3003_킹퀸룩 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        //킹, 퀸, 룩, 비숍, 나이트, 폰
        int[] arr = {1, 1, 2, 2, 2, 8};
        //compare  0 1 2 2 2 7
        //정답 1 0 0 0 0 1

        //2 1 2 1 2 1
        //-1 0 0 1 0 7
        int[] compare = new int[6];
        for (int i = 0; i < split.length; i++) {
            compare[i] = Integer.valueOf(split[i]);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            if (arr[i] == compare[i]) {
                sb.append("0").append(" ");
            } else if (arr[i] > compare[i]) {
                sb.append(arr[i] - compare[i]).append(" ");
            } else {
                sb.append(arr[i] - compare[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}

