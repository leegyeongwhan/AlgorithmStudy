package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _S2_1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int start = 0;
        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            //stack 에있는 마지막 수가 num 보다 작아야함  4, 3, 6, 8, 7, 5, 2, 1
            if (start < num) {
                for (int i = start + 1; i <= num; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = num;
            } else if (stack.peek() > num) {
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
