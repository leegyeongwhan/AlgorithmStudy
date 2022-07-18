package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _S4_3986_좋은단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        Stack<Character> stack = null;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push((str.charAt(j)));
                } else if (stack.peek() == str.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push((str.charAt(j)));
                }
            }
            if (stack.isEmpty()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
