package Bakjun;

import java.util.Scanner;

public class _111720 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String str = scanner.next(); // 공백스페이스 즉 공백 전까지 입력받은 문자열을 리턴.
    int sum = 0;

    for (int i = 0; i < num; i++) {
      sum += str.charAt(i) - '0';
    }
    System.out.println(sum);
  }
}
