package Bakjun_Silver;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int num;
        while (queue.size() > 1) {
            queue.poll();
            num = queue.poll();
            queue.offer(num);
        }
        System.out.println(queue.peek());
    }
}
