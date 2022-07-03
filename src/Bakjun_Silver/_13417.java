package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _13417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        Deque<Character> deque;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            deque = new LinkedList<>();

            for (int j = 0; j < N; j++) {
                String str = st.nextToken();
                char ch = str.charAt(0);

                if (deque.peek() == null || deque.peekFirst() >= ch) {
                    deque.offerFirst(ch);
                } else {
                    deque.offerLast(ch);
                }
            }

            while (deque.size() != 0) {
                sb.append(deque.poll());
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
