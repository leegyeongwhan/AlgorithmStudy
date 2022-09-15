package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_14888_연산자끼워넣기 {
    static int N;
    static int[] numArr;
    static int[] oper;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //수의 개수
        N = Integer.parseInt(st.nextToken());
        numArr = new int[N];
        oper = new int[4];
        //주어지는 수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        //연산자
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            oper[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numArr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int number, int index) {
        if (index == N) {
            max = Math.max(max, number);
            min = Math.min(min, number);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (oper[i] > 0) {
                oper[i]--;
                switch (i) {
                    case 0:
                        dfs(number + numArr[index], index + 1);
                        break;
                    case 1:
                        dfs(number - numArr[index], index + 1);
                        break;
                    case 2:
                        dfs(number * numArr[index], index + 1);
                        break;
                    case 3:
                        dfs(number / numArr[index], index + 1);
                        break;
                }
                oper[i]++;
            }

        }
    }
}
