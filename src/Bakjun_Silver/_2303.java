package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }
        //System.out.println(Arrays.deepToString(arr));

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int z = 0; z < 3; z++) {
                for (int j = z + 1; j < 4; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        int sum = arr[i][z] + arr[i][j] + arr[i][k];
                        int num = 0;
                        if (sum < 10) {
                            num = sum;
                        } else {
                            num = sum % 10;
                        }
                        max = Math.max(num, max);
                    }
                }
            }
            res[i] = max;
        }
        //System.out.println(Arrays.toString(res));
        int max = 0;
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if (max < res[i]) {
                max = res[i];
                index = i;
            } else if (max == res[i]) {
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}
