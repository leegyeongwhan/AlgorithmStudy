package Bakjun;

import java.util.Calendar;
import java.util.Scanner;

public class _1924 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int[] Day_Of_Moth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final String[] Day_of_week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int month = scanner.nextInt();  //달
    int day = scanner.nextInt();  //일
    int totalDays = 0;

    totalDays += day;
    for (int i = 0; i < month - 1; i++) {
      totalDays += Day_Of_Moth[i];
    }
    System.out.println(Day_of_week[totalDays % 7]);
  }
}
