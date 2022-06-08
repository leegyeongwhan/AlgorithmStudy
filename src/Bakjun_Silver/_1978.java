package Bakjun_Silver;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        while (st.hasMoreTokens()) {
            boolean check = true;
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                continue;
            }
            if (num < 2) {
                check = false;
            }
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
//////////소수라는뜻
            if (check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
