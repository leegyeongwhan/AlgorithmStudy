package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _S4_2870_수학숙제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        ArrayList<BigInteger> list = new ArrayList<>();
        ////split을 이용하면 숫자들이 하나의 덩어리로 떨어지기 때문에 \\D를 이용해 숫자만 남긴다

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("\\D");
         //    System.out.println(Arrays.toString(str));
            for (int j = 0; j < str.length; j++) {
                if (!str[j].equals("")) {
                    list.add(new BigInteger(str[j]));
                }
            }
        }
        list.sort(null);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
