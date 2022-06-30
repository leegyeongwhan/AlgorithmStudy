package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());


        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (Math.pow(i, 2) >= M && Math.pow(i, 2) <= N) {
                sum += Math.pow(i, 2);
                list.add((int) Math.pow(i, 2));
            }
        }
        if (list.size() > 0) {
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println("-1");
        }

    }
}
