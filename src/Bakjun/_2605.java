package Bakjun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2605 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        list.add(0);
        //줄에 껴든다고 보면된다.
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            list.add(i - num, i);
            //   System.out.println("list = " + list);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
