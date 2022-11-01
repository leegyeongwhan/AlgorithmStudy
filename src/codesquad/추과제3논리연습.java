package codesquad;

import java.util.Scanner;

public class 추과제3논리연습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = 100;
        int ay = 100;
        int bx = 200;
        int by = 200;
        System.out.println(" (x, y)의 좌표를 입력하시오>>");
        int nx = scanner.nextInt();
        int ny = scanner.nextInt();

        if ((nx >= ax && nx <= bx) && (ny >= ay && ny <= by)) {
            System.out.println("(" + nx + "," + ny + ") 는 안에 있습니다");
        }else {
            System.out.println("(" + nx + "," + ny + ") 는 밖에 있습니다");
        }
    }
}
