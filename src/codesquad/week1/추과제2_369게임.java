package codesquad.week1;

import java.util.Scanner;

public class 추과제2_369게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        StringBuilder sb;

        while (true) {
            sb = new StringBuilder();

            System.out.print("1~99 사이의 정수를 입력하시오>>");
            input = scanner.next();

            if (!validation(input)) {
                System.out.println("게임이 종료됩니다.");
                break;
            }

            int cnt = countNumber(Integer.parseInt(input));
            if (cnt == 1) {
                sb.append("박수짝");
            } else if (cnt == 2) {
                sb.append("박수짝짝");
            } else {
                sb.append("없습니다");
            }
            System.out.println(sb);
        }

    }

    private static int countNumber(int input) {
        String str = String.valueOf(input);
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num == 3 || num == 6 || num == 9) {
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean validation(String input) {
        if (input.equals("Quit")) {
            return false;
        } else if (input.length() > 2) {
            return false;
        }
        return true;
    }
}
