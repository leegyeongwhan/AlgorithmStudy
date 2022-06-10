package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        if (Arrays.equals(arr,ascending)) {
            System.out.println("ascending");
        }else if(Arrays.equals(arr,descending)){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }
}
