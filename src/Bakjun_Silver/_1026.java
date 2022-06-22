package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr1[i] = num;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr2[i] = num;
        }

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        ///다른 정렬 방법을 이용 할 수 있겠지만 Collections클래스를 사용해봤다.
        //1은 오름차순
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] * arr2[i];
        }

        System.out.println(sum);
    }
}
