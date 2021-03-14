package com.company;

import java.util.Scanner;

public class WarningMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your num:");
        float in = sc.nextFloat();
        System.out.printf("%.2f Inchs = %.2f centimeters",in/2.54);
        System.out.printf("%.2f Inchs = %.2f centimeters",in*2.54);
    }
}
