package Bakjun_Silver;

import java.util.Arrays;
import java.util.Scanner;

public class _7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] member = new int[n][2];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            member[i][0] = x;
            member[i][1] = y;
        }
        //  System.out.println(Arrays.deepToString(member));

        for (int i = 0; i < member.length; i++) {
            int cnt = 1;
            for (int j = 0; j < member.length; j++) {
                if (i == j) continue;
                //키와 몸무게 둘다 커야 덩치가 크다고 할 수있다.
                if (member[i][0] < member[j][0] && member[i][1] < member[j][1]) {
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }

    }
}
