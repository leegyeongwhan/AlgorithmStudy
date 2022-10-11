package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");


        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // -로 나눈 각 항들을 더해준다
            int res = 0;
            String[] plus = arr[i].split("\\+");
            for (int j = 0; j < plus.length; j++) {
                res += Integer.parseInt(plus[j]);
            }

            //sum을 임의 값으로 잡고 sum에 양수 첫번째 항을 넣어준 후 두번쨰부터는 뺴줘야함
            if (sum == Integer.MAX_VALUE) {
                sum = res;
            } else {
                sum -= res;
            }
        }
        System.out.println(sum);
    }
}
