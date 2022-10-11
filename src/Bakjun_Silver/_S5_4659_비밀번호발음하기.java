package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
 * 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
 * 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
 */
public class _S5_4659_비밀번호발음하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        char[] arr = {'a', 'e', 'i', 'o', 'u'};


        while (true) {
            if ((str = br.readLine()).equals("end")) {
                break;
            }

            boolean check1 = false;
            boolean check2 = true;
            boolean check3 = true;
            Loop1:
            //조건 1 :모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == str.charAt(i)) {
                        check1 = true;
                        break Loop1;
                    }
                }
            }

            Loop2:
            //모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    for (int k = j + 1; k < str.length(); k++) {
                        if (str.charAt(i) == str.charAt(j) && str.charAt(i) == str.charAt(k)) {
                            check2 = false;
                            break Loop2;
                        }
                        continue;
                    }
                    continue;
                }
            }

            Loop3:
            //조건 3:  * 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        if (str.charAt(i) == 'e' && str.charAt(j) == 'e'
                                || str.charAt(i) == 'o' && str.charAt(j) == 'o') {
                            continue;
                        }
                        check3 = false;
                        break Loop3;
                    }
                    continue;
                }
            }

            if (check1 == true && check2 == true && check3 == true) {
                System.out.println("<" + str + "> is acceptable.");
            } else {
                System.out.println("<" + str + "> is not acceptable.");
            }
        }
    }
}
