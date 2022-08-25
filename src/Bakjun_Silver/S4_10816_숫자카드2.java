package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];

        st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            arrN[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        int M = Integer.parseInt(br.readLine());
        Arrays.sort(arrN);
//        System.out.println(Arrays.toString(arrN));
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < M; j++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arrN, num) - lowerBound(arrN, num)).append(" ");
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (key <= arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {

            int mid = (lo + hi) / 2; // 중간위치를 구한다.
            if (key < arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
