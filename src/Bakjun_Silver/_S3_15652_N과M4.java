package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _S3_15652_N과M4 {
    static int N;
    static int M;
    static int[] arr;
    static StringBuffer sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        sb = new StringBuffer();
        dfs(1, 0);
        System.out.println(sb);
    }

    //arrlenght  3
    private static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;

        }
        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
