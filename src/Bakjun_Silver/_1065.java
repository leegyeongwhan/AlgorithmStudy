package Bakjun_Silver;

import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); //110
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (i == 1000) {
                break;
            }
            if (checkHansu(i)) {
                count++;
            }
        }
        System.out.println( count);
    }

    private static boolean checkHansu(int i) {  // 3자리 까지만 검사
        if (i >= 1 && i <= 99) return true;
        String[] treeJari = String.valueOf(i).split("");
        int[] chageArr = new int[3];
        for (int j = 0; j < treeJari.length; j++) {
            chageArr[j] = Integer.parseInt(treeJari[j]);
        }
        if (chageArr[1] - chageArr[0] == chageArr[2] - chageArr[1]) {
            return true;
        } else {
            return false;
        }
    }
}
