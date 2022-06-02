package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            ////////// X의 수를 카운트한다
            if (str.charAt(i) == 'X') {
                cnt++;
            }
            //////////////////////  '.'이나왔다는 소리
            else {   //  '.'이나왔다는 소리
                if (cnt % 2 == 1) {   // cnt 가 홀수 면 찍을수없다
                    sb = new StringBuilder();
                    sb.append(-1);
                    break;
                }
                if (cnt % 2 == 0) {       //글자가 짝수여야찍는다
                    while (cnt > 0) {
                        if (cnt >= 4) {
                            sb.append("AAAA");
                            cnt -= 4;
                        } else {
                            sb.append("BB");
                            cnt -= 2;
                        }
                    }
                }  ////////////// 나머지 반복문에서는 . 을찍는ㄴ다
                sb.append('.');
            }
        }

        ///////////////// .이안오고 x만왔을 때
        if (cnt > 0) {
            if (cnt % 2 == 1) {   // 홀수
                sb = new StringBuilder();
                sb.append(-1);
            } else {
                while (cnt != 0) {
                    if (cnt >= 4) {
                        sb.append("AAAA");
                        cnt -= 4;
                    } else {
                        sb.append("BB");
                        cnt -= 2;
                    }
                }
            }
        }


        System.out.println(sb);
    }
}
