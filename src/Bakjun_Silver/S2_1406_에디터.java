package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S2_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : input) {
            leftStack.push(c);
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "L":
                    if (!leftStack.isEmpty()) {
                        Character pop = leftStack.pop();
                        rightStack.push(pop);
                    }
                    break;
                case "D":
                    if (!rightStack.isEmpty()) {
                        Character pop = rightStack.pop();
                        leftStack.push(pop);
                    }
                    break;
                case "B":
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case "P":
                    char[] p = st.nextToken().toCharArray();
                    leftStack.push(p[0]);
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) {
            Character pop = leftStack.pop();
            rightStack.push(pop);
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
