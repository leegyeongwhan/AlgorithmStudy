package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _S3_17413_단어뒤집기 {
    static StringBuffer sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        sb = new StringBuffer();

        //공백과 괄호를 구분하자
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                print(stack);
                sb.append(str.charAt(i));
                flag = true;
            } else if (str.charAt(i) == '>') {
                sb.append(str.charAt(i));
                flag = false;
            } else if (flag) {
                sb.append(str.charAt(i));
            } else { //나머지 상황들 " " 인상황
                if (str.charAt(i) == ' ') {
                    print(stack);
                    sb.append(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }
        print(stack);
        System.out.println(sb);
    }

    private static void print(Stack<Character> stack) {
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }
}
