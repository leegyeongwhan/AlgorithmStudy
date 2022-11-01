package codesquad;

import java.util.Scanner;

public class 추과제4조건문과함수연습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" (x1, y1)의 좌표를 입력하시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println(" (x2, y2)의 좌표를 입력하시오>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (isInRect(x1, y1, 100, 100, 200, 200) && isInRect(x2, y2, 100, 100, 200, 200)) {
            System.out.println("겹칩니다");
            return;
        }
        System.out.println("안겹칩니다");
    }

    public static boolean isInRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
            return true;
        } else {
            return false;
        }
    }
}
