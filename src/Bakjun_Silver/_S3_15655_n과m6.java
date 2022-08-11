package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _S3_15655_n과m6 {
    static int N;
    static int M;
    static boolean[] visit;
    static int[] arr;
    static int[] numArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.valueOf(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];
        arr = new int[N];
        numArr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bfs(0, 0);
    }

    private static void bfs(int start, int depth) {
        if (depth == M) {
            //출력
            for (int i : numArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                numArr[depth] = arr[i];
                bfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }
}
