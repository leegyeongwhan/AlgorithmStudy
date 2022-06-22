package Bakjun_Silver;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st1 = new StringTokenizer(br.readLine(), " ");


        for (int j = 0; j < M; j++) {
            int num = Integer.parseInt(st1.nextToken());
            if (binarySearch(arr, num)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static boolean binarySearch(int[] arr, int num) {
        int start = 0;
        int mid;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}