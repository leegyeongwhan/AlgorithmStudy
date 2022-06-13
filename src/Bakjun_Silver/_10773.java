package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack[size - 1] = 0;
                size--;
            } else {
                stack[size] = num;
                size++;
            }
        }
        int res = 0;
        for (int i = 0; i < stack.length; i++) {
            res += stack[i];
        }
        System.out.println(res);
    }
}
