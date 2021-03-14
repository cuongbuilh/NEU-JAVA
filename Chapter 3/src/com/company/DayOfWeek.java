package com.company;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] calendarDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.print("Input day of week:");
        int dayofweek = scanner.nextInt();
        System.out.println("It is " + calendarDays[dayofweek - 1]);
    }
}
