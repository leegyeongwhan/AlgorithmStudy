package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();   //   System.out.println(str);
            if (check(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean check(String str) {
        boolean[] check = new boolean[26];
        int preChar = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (check[ch - 'a'] == false) {   //배열에 들어온 알파벳이 있는지 없으면 넣어준다
                check[ch - 'a'] = true;
                preChar = ch;
            } else if (ch == preChar) {       //true라면 현재 문자랑 전에문자랑 같음
                continue;
            } else {
                return false;      //그룹체커가아님
            }
        }
        return true;
    }
}
