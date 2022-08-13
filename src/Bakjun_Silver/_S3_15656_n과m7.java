package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _S3_15656_n과m7 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[] arr;
    static int[] numArr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        numArr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bfs(0);
        System.out.println(sb);
    }

    private static void bfs(int depth) {
        if (depth == M) {
            for (int i : numArr) {
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            numArr[depth] = arr[i];
            bfs(depth + 1);
        }
    }
}
