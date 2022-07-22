package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _S5_5568_카드놓기 {
    static int N;
    static int K;
    static String[] arr;
    static boolean[] visit;
    static String[] list;
    static Set<Integer> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        visit = new boolean[N];
        arr = new String[K];
        list = new String[N];
        set = new HashSet<>();

        for (int i = 0; i < list.length; i++) {
            list[i] = br.readLine();
        }
        combi(0);
        System.out.println(set.size());
    }

    static void combi(int depth) {
        if (depth == K) {
            String str = "";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i];
               // System.out.println(str);
            }
            set.add(Integer.parseInt(str));
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = list[i];
                combi(depth + 1);
                visit[i] = false;
            }
        }
    }
}
//set은 중복을 처리해주니 따로 안해주고 완전탐색으로