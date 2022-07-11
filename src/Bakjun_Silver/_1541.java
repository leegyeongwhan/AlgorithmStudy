package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] arr;
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr = new int[m];
            int j = 0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                arr[j] = Integer.parseInt(st.nextToken());
                j++;
            }
            //오름차순 정렬후 배치
            Arrays.sort(arr);
            // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            int[] resArr = new int[arr.length];
            int startIndex = 0;
            int endtIndex = arr.length - 1;

            for (int k = 0; k < resArr.length; k++) {
                if (k % 2 == 0) {
                    resArr[startIndex++] = arr[k];

                } else if (k % 2 == 1) {
                    resArr[endtIndex--] = arr[k];
                }
            }
            int max = Math.abs(resArr[0] - resArr[resArr.length - 1]);
            for (int z = 1; z < resArr.length; z++) {
                max = Math.max(Math.abs(resArr[z] - resArr[z - 1]), max);
            }
            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }
}
