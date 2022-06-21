package Bakjun_Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        while (queue.size() > 1) {
            sb.append(queue.poll()).append(" ");
            int num = queue.poll();
            queue.offer(num);
        }
        sb.append(queue.peek()).append(" ");
        System.out.println(sb);
    }
}
