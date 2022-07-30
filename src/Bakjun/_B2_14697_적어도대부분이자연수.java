package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _B2_14697_적어도대부분이자연수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int n = 1;
       Loop: while (true) {
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        if (n % arr[i] == 0 && n % arr[j] == 0 && n % arr[k] == 0) {
                            break Loop;
                        }
                    }
                }
            }
            n++;
        }

        System.out.println(n);
    }
}
