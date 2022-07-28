package Bakjun_Silver;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _S5_11728_배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arrA = new int[N];
        int[] arrB = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrSum = new int[N + M];

//        System.arraycopy(arrA, 0, arrSum, 0, arrA.length);
//        System.arraycopy(arrB, 0, arrSum, arrA.length, arrB.length);
        int arrIndex = 0;
        for (int i = 0; i < N; i++) {
            arrSum[arrIndex++] = arrA[i];
        }

        for (int i = 0; i < M; i++) {
            arrSum[arrIndex++] = arrB[i];
        }
        Arrays.sort(arrSum);

        for (int i : arrSum) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
    }
}
