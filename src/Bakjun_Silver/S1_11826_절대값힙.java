package Bakjun_Silver;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class S1_11826_절대값힙 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int abs = Math.abs(a);
            int abs1 = Math.abs(b);
            if (abs > abs1) {
                return abs - abs1;
            } else if (abs1 == abs) {
                return a - b;
            }
            return -1;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                if (queue.peek() == null) {
                    sb.append(0).append("\n");
                } else {
                    Integer poll = queue.poll();
                    sb.append(poll).append("\n");
                }
            } else {
                queue.add(num);
            }
        }
        System.out.println(sb);
    }
}
