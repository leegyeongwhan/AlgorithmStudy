package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4673 {
    public static void main(String[] args) throws IOException {
//        1.함수로 숫자를 체크한다
//        2.생성자가 있는것을 계산한다
//        3.부울 배열을 통해 생성자인 것은 true를준다
//         4. false인 수들을 출력한다
        boolean[] arr = new boolean[10001];
        for (int i = 1; i <= 10001; i++) {
            int n = checkNumber(i);
            if (n < 10001) {
                arr[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) { //false면
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    static int checkNumber(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }    //자릿수더하기
        return sum;
    }
}
