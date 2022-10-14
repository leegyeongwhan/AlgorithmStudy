package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G5_1759_암호만들기 {
    static char[] arr;
    static boolean[] visit;
    static boolean[] movisit;
    static int L;
    static int C;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[C];
        visit = new boolean[C];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
        //       System.out.println(Arrays.toString(arr));
        back(0, 0);
        System.out.println(sb);
    }

    private static void back(int depth, int start) {
        if (depth == L) {
            if (valid()) {
                for (int i = 0; i < arr.length; i++) {
                    if (visit[i]) {
                        sb.append(arr[i]);
                    }
                }
                sb.append("\n");
                return;
            }
        }

        for (int i = start; i < C; i++) {
            visit[i] = true;
            back(depth + 1, i + 1);
            visit[i] = false;
        }
    }

    private static boolean valid() {
        int mo = 0;
        int ja = 0;

        for (int i = 0; i < C; i++) {
            if (visit[i]) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    mo++;
                } else {
                    ja++;
                }
            }
        }

        if (mo >= 1 && ja >= 2) {
            return true;
        }
        return false;
    }
}
