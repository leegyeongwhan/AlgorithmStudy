package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _S5_8979_올림피 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N + 1][4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int ranking = Integer.parseInt(st.nextToken());
            arr[ranking][0] = Integer.parseInt(st.nextToken());
            arr[ranking][1] = Integer.parseInt(st.nextToken());
            arr[ranking][2] = Integer.parseInt(st.nextToken());
        }

        int rank = 1;
        for (int i = 1; i <= N; i++) {
            if (arr[i][0] > arr[K][0]) {
                rank++;
            } else if (arr[i][0] == arr[K][0] && arr[i][1] > arr[K][1]) {
                rank++;
            } else if (arr[i][0] == arr[K][0] && arr[i][1] == arr[K][1] && arr[i][2] > arr[K][2]) {
                rank++;
            }
        }
        System.out.println(rank);
//        System.out.println(Arrays.deepToString(arr));
/*
금메달 수가 더 많은 나라
금메달 수가 같으면, 은메달 수가 더 많은 나라
금, 은메달 수가 모두 같으면, 동메달 수가 더 많은 나라
모든 나라의 순위가 아닌 특정 나라의 순위를 구하자
 */


//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[1] < o2[1]) {
//                    return 1;
//                } else if (o1[1] == o2[1]) {
//                    if (o1[2] < o2[2]) {
//                        return 1;
//                    } else if (o1[2] == o2[2]) {
//                        if (o1[3] < o2[3]) {
//                            return 1;
//                        }
//                    }
//                }
//                return -1;
//            }
//        });
//        // System.out.println(Arrays.deepToString(arr));
//        for (int i = 0; i < N; i++) {
//            if (arr[i][0] == K) {
//                System.out.println(i + 1);
//            }
//        }
    }
}
