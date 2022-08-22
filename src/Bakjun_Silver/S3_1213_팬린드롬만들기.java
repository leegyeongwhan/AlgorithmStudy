package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 모든 문자열을 알파벳 순으로 담는다 그중 홀수 개인 알파벳이 1개상이면 팬린드롬이아니다
 * 짝수인 알파벳들을 나열한 후 뒤짚은 후 합치면 그 문자열이 팬린드롬
 */
public class S3_1213_팬린드롬만들기 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//
//        char[] arr = str.toCharArray();
//
//        //짝이맞는지
//        int[] alphabet = new int[26];
//
//        for (int i = 0; i < arr.length; i++) {
//            alphabet[arr[i] - 65]++;
//        }
//        //   System.out.println(Arrays.toString(alphabet));
//        // 홀수 알파벳이 1개이상이면 그수는 팬린드롬이아니다
//        int oddCnt = 0;
//        for (int i = 0; i < alphabet.length; i++) {
//            if (oddCnt > 1) {
//                System.out.println("I'm Sorry Hansoo");
//                System.exit(0);
//            }
//            if (alphabet[i] % 2 != 0) {
//                //홀수인 알파벳
//                oddCnt++;
//            }
//        }
//
//
//        //짝수인 알파벳을 나열 한 후 뒤짚은 수와 합치면 팬린드롬이 완성
//        //홀수인 알파베은 무조건 하나다 따로 저장해두자
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < alphabet.length; i++) {
//            for (int j = 0; j < alphabet[i] / 2; j++) {
//                sb.append((char)(i + 65));
//            }
//        }
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append(sb).reverse();
//
//        for (int i = 0; i < alphabet.length; i++) {
//            if (alphabet[i] % 2 == 1) {
//                sb.append((char)(i + 65));
//            }
//        }
//        sb.append(sb2);
//
//        System.out.println(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] alpha = new int[26];
        for(int i=0; i<line.length(); i++) {
            int idx = line.charAt(i)-'A';
            alpha[idx]++;
        }

        int isOne =0;
        for(int i=0; i<alpha.length; i++) {
            if(alpha[i]%2!=0) isOne++;
        }

        String answer ="";
        StringBuilder sb = new StringBuilder();
        if(isOne>1) answer += "I'm Sorry Hansoo";
        else {
            for(int i=0; i<alpha.length; i++) {
                for(int r=0; r<alpha[i]/2; r++) {
                    sb.append((char)(i+65));
                }
            }
            answer += sb.toString();
            String end = sb.reverse().toString();

            sb = new StringBuilder();
            for(int i=0; i<alpha.length; i++) {
                if(alpha[i]%2==1) {
                    sb.append((char)(i+65));
                }
            }
            answer +=sb.toString()+end;
        }
        System.out.println(answer);
    }
}
