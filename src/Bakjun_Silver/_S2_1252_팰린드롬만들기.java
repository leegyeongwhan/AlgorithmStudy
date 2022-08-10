package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _S2_1252_팰린드롬만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int len = str.length();
        int i = 1;
        int cnt = 0;
        while (true) {
            //팰린드롬이면 출력
            if (chack(str)) {
                System.out.println((len + cnt));
                return;
            }
            str = str.substring(i);
            cnt++;
        }

    }

    //팬린드롬이니?
    private static boolean chack(String value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value).reverse();

        if (value.equals(sb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
