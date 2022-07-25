package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _S2_3062_수뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer dap = new StringBuffer();

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            int num = Integer.parseInt(br.readLine());
            String str = String.valueOf(sb.append(num).reverse());
            int sum = num + Integer.parseInt(str);
            String str2 = String.valueOf(sum);
            boolean flag = true;
            for (int j = 0; j < str2.length() / 2; j++) {
                char start = str2.charAt(j);
                char last = str2.charAt(str2.length() - 1 - j);
                if (start != last) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                dap.append("YES").append("\n");
            } else {
                dap.append("NO").append("\n");
            }
        }
        System.out.println(dap);
    }
}
