package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S1_1931_회의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[input][2];

        /**
         * 겹치지 않는 활동에 대해 종료시간이 빠르면 더 많은 활동을 선택할 수 있는 시간이 많아진다
         *  그리드 문제
         1.끝 나는 시점으로 정렬한다
         2.끝나는 시점이 같은경우 시작시점을 오름차순
         3.직정 종료시간이 다음 시작보다 작거나 같으면 갱신.
         */

        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i][0] = start;
            arr[i][1] = end;
        }
        //종료 시점으로 정렬한다
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int pre_end = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] >= pre_end) {
                pre_end = arr[i][1];
                res++;
            }
        }
        System.out.println(res);
    }
}

