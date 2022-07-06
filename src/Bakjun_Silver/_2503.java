package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2503 {
    static String[] strArr;
    static int[] S;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        strArr = new String[n];
        S = new int[n];
        B = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            strArr[i] = str;
            S[i] = strike;
            B[i] = ball;
        }
        baseball();
    }

    private static boolean checked(int currentStrike, int currentBall, int index) {
        if ((currentStrike == S[index] && currentBall == B[index])) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkedNum(int num) {
        String str = String.valueOf(num);

        if (str.charAt(0) == str.charAt(1)) {
            return false;
        }
        if (str.charAt(1) == str.charAt(2)) {
            return false;
        }
        if (str.charAt(0) == str.charAt(2)) {
            return false;
        }
        if (str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0')
            return false;
        return true;
    }

    static void baseball() {
        int result = 0;
        for (int i = 123; i <= 987; i++) {
            //반복문을 돌면서 안되는 숫자체크
            if (!checkedNum(i)) {
                continue;
            }
            //입력받은 숫자와 반복문의 숫자 비교
            String currentStr = String.valueOf(i);
            if (check1(currentStr)) {
                result++;
            }
        }
        System.out.println(result);
    }


    static boolean check1(String currentStr) {
        int currentBall = 0;
        int currentStrike = 0;
        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            String preStr = strArr[i];
            currentBall = 0;
            currentStrike = 0;
            //반복문을 돌면서현재의 숫자와 입력받은 숫자 볼 ,스트라이크 카운트
            for (int a = 0; a < 3; a++) {
                if (currentStr.charAt(a) == preStr.charAt(a)) {
                    currentStrike++;
                }
            }

            for (int b = 0; b < 3; b++) {
                for (int k = 0; k < 3; k++) {
                    if (currentStr.charAt(b) == preStr.charAt(k)) {
                        if (b != k) {
                            currentBall++;
                        }
                    }
                }
            }

            if (checked(currentStrike, currentBall, i)) {
                cnt++;
            }
            if (cnt == strArr.length) {
                //  System.out.println(currentStr);
                return true;  //우리가 찾는 숫자
            }
        }
        return false;  //아니면 false
    }
}