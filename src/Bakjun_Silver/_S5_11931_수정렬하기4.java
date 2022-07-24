package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _S5_11931_수정렬하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순
        StringBuffer sb =new StringBuffer();
        for (Integer i : tmp) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
