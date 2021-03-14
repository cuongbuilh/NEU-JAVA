package com.company;

import java.util.Scanner;

public class PayForEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter hours:");
        float hours = sc.nextFloat();

        System.out.println("enter pay rate: ");
        float rate = sc.nextFloat();

        System.out.printf("total pay: %.2f", hours*rate);
    }
}
