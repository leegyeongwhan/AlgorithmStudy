package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (true) {
            str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            stack(str);
        }
    }

    static void stack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    System.out.println("no");
                    return;
                } else {
                    stack.pop();
                }
            }

            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    System.out.println("no");
                    return;
                } else {
                    stack.pop();
                }
            }

        }
        ////// 반복문을 다돌고오면 왼쪽 괄호들이 다비워져있어야한다. 빈 문자열들도 스택이비워져있어서 ok
        if (stack.isEmpty()) {
            System.out.println("yes");
            return;
        } else {
            System.out.println("no");
            return;
        }


    }
}
