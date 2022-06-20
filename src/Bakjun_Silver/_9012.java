package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            System.out.println(extracted(str));
        }
    }

    private static String extracted(String str) {
        Stack<String> stack = new Stack<>();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') {
                stack.push('(' + "");
                /////// ')'요게 더많을 경우 '('요거를 모꺼내와서 오류가 생김
            } else if (stack.isEmpty()) {
                return "NO";
            } else if (str.charAt(j) == ')') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
