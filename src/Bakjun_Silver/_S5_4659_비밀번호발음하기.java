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
            int index = 0;
            int moNum = 0;
            int jaNum = 0;
            boolean check2 = true;
            boolean check1 = false;
            boolean check3 = false;
            boolean isaou = false;
            //1
            for (char i : str.toCharArray()) {
                check1 = false;
                for (char c : arr) {
                    if (i == c) {
                        check1 = true;
                        break;
                    }
                }

                //2
                if (check1) {  //모음
                    isaou = true;
                    moNum++;
                    jaNum = 0;
                } else {  // 자음
                    jaNum++;
                    moNum = 0;
                }

                if (moNum == 3 || jaNum == 3) {
                    check3 = false;
                    break;
                }

                //3
                char pastChar = ' ';
                if (index > 0) {
                    pastChar = str.charAt(index - 1);
                }
                if (pastChar == i) {
                    check2 = false;
                    if (pastChar == 'e' && i == 'e' ||
                            pastChar == 'o' && i == 'o') {
                        check2 = true;
                    }
                }
                index++;
            }
//            System.out.println(jaNum);
//            System.out.println(moNum);
//            System.out.println(check3);
//            System.out.println(check2);

            if (isaou && check2 && jaNum < 3 && moNum < 3) {
                System.out.println("<" + str + "> is acceptable.");
            } else {
                System.out.println("<" + str + "> is not acceptable.");
            }
        }
    }
}
