package Bakjun_Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _10814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] member = new String[n][2];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            String str = scanner.next();
            member[i][0] = String.valueOf(num);
            member[i][1] = str;
        }

        Arrays.sort(member, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(member[i][0] + " " + member[i][1]);
            }
        }
    }
}
