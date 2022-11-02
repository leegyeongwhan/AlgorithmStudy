package codesquad.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 좌표를 배열로 생각하자
 * 첫번쨰와 마지막줄 구분
 * 중간을  구분
 * 나머지
 */
public class S4_13015_별찍기23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = n - 1;
        int c = 3 * n - 3;
        int d = 4 * n - 4;

        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i == 1 || i == n * 2 - 1) {      //상단부 //하단부
                for (int j = a; j <= b; j++) {
                    System.out.print("*");
                }
                for (int j = b + 1; j < c; j++) {
                    System.out.print(" ");
                }
                for (int j = c; j <= d; j++) {
                    System.out.print("*");
                }
            } else if (i == n) { //중간부
                for (int j = 0; j < a; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = a + 1; j < b; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = b + 1; j < c; j++) {
                    System.out.print(" ");
                }
                for (int j = c + 1; j < d; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {  //나머지
                for (int j = 0; j < a; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = a + 1; j < b; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = b + 1; j < c; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = c + 1; j < d; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

            if (i < n) {
                a++;
                b++;
                c--;
                d--;
            } else {
                a--;
                b--;
                c++;
                d++;
            }
        }

    }
}
