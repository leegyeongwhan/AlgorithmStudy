package Bakjun_Silver;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15650 {
    static int[] res;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        res = new int[M];

        backtracking(1, 0);
    }

    static void backtracking( int start, int depth) {
        if (depth == M) {
            for (int re : res) {
                System.out.print(re + " ");
            }
            System.out.println();
            return;
        }
        //중복이없어서 방문여부가 필요없다
        for (int i = start; i <= N; i++) {
            res[depth] = i;
            backtracking(i + 1, depth + 1);

        }
    }

}
