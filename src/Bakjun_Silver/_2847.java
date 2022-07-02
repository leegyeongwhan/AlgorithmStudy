package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        int cnt = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0)
                break;

            if (arr[i] <= arr[i - 1]) {
                cnt += (arr[i - 1] - (arr[i] - 1));
                arr[i - 1] = arr[i] - 1;
            }

            /*
            	for (int i = n - 2; i >= 0; i--) {
			if(ar[i + 1] <= arr[i]){
				cnt += arr[i] - (arr[i + 1] - 1);
				arr[i] = arr[i + 1] - 1;
			}
		}
             */
        }
        System.out.println(cnt);
    }
}

