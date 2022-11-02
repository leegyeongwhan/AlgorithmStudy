package codesquad.week1;

import java.util.Scanner;

public class 추과제5분기문익히기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        double a = scanner.nextDouble();
        String oper = scanner.next();
        double b = scanner.nextDouble();
        System.out.print(a + oper + b + "의 계산 결과는 =");

        switch (oper) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌수없습니다");
                    return;
                }
                System.out.println(a / b);
                break;
        }
    }
}
