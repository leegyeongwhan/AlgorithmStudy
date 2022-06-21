package Bakjun_Silver;

import java.io.IOException;
import java.util.Scanner;

public class _10845 {
    static Scanner scanner;
    static int[] queue;
    static int frontIndex = 0;
    static int backIndex = -1;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        queue = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            switch (input) {
                case "push":
                    int num = scanner.nextInt();
                    push(num);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                  if(empty()){
                      System.out.println("1");
                  }else {
                      System.out.println("0");
                  }
                    break;
                case "front":
                    System.out.println(front());
                    System.out.println("pop1"+frontIndex);

                    break;
                case "back":
                    System.out.println(back());
                    break;
            }
        }
    }

    private static void push(int num) {
        queue[++backIndex] = num;
    }

    private static int pop() {
        if (empty()) {
            return -1;
        } else {
            return queue[frontIndex++];
        }
    }

    public static boolean empty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int size() {
        return backIndex - frontIndex + 1;
    }

    private static int front() {
        if (empty()) {
            return -1;
        } else {
            return queue[frontIndex];
        }
    }

    private static int back() {
        if (empty()) {
            return -1;
        } else {
            return queue[backIndex];
        }
    }
}
