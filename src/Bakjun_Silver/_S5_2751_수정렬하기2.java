package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _S5_2751_수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        final int size = list.size();

        for (int i = 0; i < size; i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
