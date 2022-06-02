package Bakjun_Silver;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1439 {
    public static void main(String[] args) throws IOException {
        checkNumber();
//        String str = br.readLine();
//        StringBuilder sb = new StringBuilder();
//        char ch = ' ';
//        int cnt = 0;
//
//        ch = str.charAt(0);
//        sb.append(ch);
//        for (int i = 0; i < str.length(); i++) {
//            if (ch != str.charAt(i)) {
//                sb.append(str.charAt(i));
//                ch = str.charAt(i);
//                cnt++; //다른 숫자가 나올때
//            }
//        }
////        System.out.println("sb = " + sb);
////        System.out.println("cnt = " + cnt);
//        int oneCnt = 0;
//        int zeroCnt = 0;
//
//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.charAt(i) == '1') {
//                oneCnt++;
//            } else {
//                zeroCnt++;
//            }
//        }
//        int result = Math.min(oneCnt, zeroCnt);
//        System.out.println(result);
    }

    static void checkNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str, "1");
        StringTokenizer st2 = new StringTokenizer(str, "0");
        System.out.println(Math.min(st1.countTokens(), st2.countTokens()));
    }
}
