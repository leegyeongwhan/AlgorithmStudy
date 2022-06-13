package Bakjun_Silver;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] result = new int[N];
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append("<");
        while (queue.size() > 1) {
            for (int j = 0; j < K - 1; j++) {
                int res = queue.poll();
                queue.offer(res);

            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
