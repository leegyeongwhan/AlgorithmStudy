package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2 가지 조건만 가능
 * 문자열의 뒤에 A를 추가한다.
 * 문자열을 뒤집고 뒤에 B를 추가한다.
 * <p>
 * 반대로 생각하자 T를 -> S로만들자
 * T의 끝이 A이면 A를제거
 * T의 끝이 B이면 B제거 후 뒤집기
 */
public class G5_12904_A와B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        StringBuilder sb = new StringBuilder();


        sb.append(T);
        while (true) {
            if (sb.toString().equals(S)) {
                System.out.println(1);
                return;
            }

            if (validation(S, sb)) break;

            String lastIndex = sb.substring(sb.length() - 1);
            if (lastIndex.equals("A")) {
                sb.deleteCharAt(sb.length() - 1);
            } else if (lastIndex.equals("B")) {
                sb.deleteCharAt(sb.length() - 1);
                sb.reverse();
            }
        }
        System.out.println(0);
    }

    private static boolean validation(String S, StringBuilder sb) {
        if (sb.length() == S.length()) {
            return true;
        }
        return false;
    }
}
