package com.company;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int day:");
        int day = sc.nextInt();
        String out = "";

        switch(day){
            case 1: out = "Monday";break;
            case 2: out = "Tuesday";break;
            case 3: out = "Wednesday";break;
            case 4: out = "Thursday";break;
            case 5: out = "Friday";break;
            case 6: out = "Saturday";break;
            case 7: out = "Sunday";break;
            default: out = "err"; break;
        }

        System.out.println(out);
    }
}
