package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int prev_sum_count = 0;
        while (true) {
            if (num <= cross_count + prev_sum_count) {
                if (cross_count % 2 != 1) {
                    System.out.print((cross_count - (num - prev_sum_count - 1)) + "/" + (num - prev_sum_count));
                    break;
                } else {
                    System.out.print((num - prev_sum_count) + "/" + (cross_count - (num - prev_sum_count - 1)));
                    break;
                }
            }else {
                prev_sum_count += cross_count;
                cross_count++;
            }
        }
    }
}
