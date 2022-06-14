package Bakjun;

import java.util.Scanner;

public class _22864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();  //1시간 쌓이는 피로도 5
        int B = scanner.nextInt(); //일처리  3
        int C = scanner.nextInt(); //1시간 쉬면 깎이는 피로도 2
        int M = scanner.nextInt();  //피로도 10
        int life = 0;
        int time = 24;
        int result = 0;
        if (A > M) {
            result = 0;
        } else {
            while (time > 0) {
                if (life + A <= M) {
                    result += B;
                    life += A;
                } else {
                    life -= C;
                    if (life < 0) {
                        life = 0;
                    }
                }
                time--;
            }
        }                                    //쉬거나일하거나 둘중 하나는 해야한다.
        System.out.println(result);
    }
}
