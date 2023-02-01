package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G5_1456_거의소수 {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long[] arr = new long[10000001];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(arr.length); i++) { // 제곱근 까지만 수행
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j < arr.length; j = j + i) { // 배수 지우기
                arr[j] = 0;
            }
        }

        int result = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 0) {
                long temp = arr[i];
                while ((double) arr[i] <= (double) b / (double) temp) {
                    if ((double) arr[i] >= (double) a / (double) temp) {
                        result++;
                    }
                    temp = temp * arr[i];
                }
            }
        }
        System.out.println(result);
    }
}

