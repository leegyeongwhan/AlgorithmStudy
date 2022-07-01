package Bakjun;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _2948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] WEEK = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int DAY = scanner.nextInt();
        int MONT = scanner.nextInt();
        LocalDate date = LocalDate.of(2009, MONT, DAY);
        // System.out.println("date = " + date);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        int dayOfWeekNumber = dayOfWeek.getValue();

        System.out.println(WEEK[dayOfWeekNumber]);
    }
}
