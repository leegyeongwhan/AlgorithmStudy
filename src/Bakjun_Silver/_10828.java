package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {
    static Scanner scanner;
    static int[] stack;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        stack = new int[num];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            switch (str) {
                case "push":
                    int n = scanner.nextInt();
                    push(n);
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int n) {
        stack[size] = n;
        size++;
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int result = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return result;

        }
    }
}
