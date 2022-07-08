package Bakjun_Silver;
//package Bakjun_Silver;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
////dfs  arr 조건들 visit방문 여부  순서가 상관없다 컴비네이션 순열
//public class _2422 {
//    static boolean[][] arr;
//    static boolean[] visit;
//    static int[] res = new int[3];
//    static int answer = 0;
//    static int N;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        arr = new boolean[N + 1][N + 1];
//        visit = new boolean[N + 1];
//
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            // 순서는 상관이없다.
//            arr[a][b] = true;
//            arr[b][a] = true;
//        }
//        //깊이
//        checked(0, 1);
//        System.out.println(answer);
//    }
//
//    //nC3
//    private static void checked(int depth, int index) {
//        if (depth == 3) {
//            if (check()) {
//                answer++;
//            } else {
//                return;
//            }
//        }
//        for (int i = index; i < N + 1; i++) {
//            if (!visit[i]) {
//                visit[i] = true;
//                //아이스크림
//                res[depth] = i;
//                checked(depth + 1, i + 1);
//                visit[i] = false;
//            }
//        }
//    }
//
//    private static boolean check() {
//        //중복체크
//        for (int i = 0; i < 3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                if (arr[res[i]][res[j]]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//}
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2422 {
    static int N;
    static int M;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 순서는 상관이없다.
            arr[a][b] = true;
            arr[b][a] = true;
        }
        //깊이
        System.out.println(checked());
    }

    private static int checked() {
        int cnt = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = i + 1; j < N + 1; j++) {
                for (int k = j + 1; k < N + 1; k++) {
                    if (arr[i][j] || arr[i][k] || arr[j][k]) {
                        continue;
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }

}