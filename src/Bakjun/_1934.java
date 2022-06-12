package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int max = Math.max(A, B);
            int min = Math.min(A, B);
            int gcd = gcd(max, min);
            System.out.println(lcm(A, B, gcd));
        }

    }

    //단 A가  B보다크다
    private static int gcd(int A, int B) {
        while (true) {
            int r = A % B;
            if (r == 0) {
                return B;
            }
            A = B;
            B = r;
        }
    }

    private static int lcm(int A, int B, int gcd) {
        return (A * B) / gcd;
    }
}
