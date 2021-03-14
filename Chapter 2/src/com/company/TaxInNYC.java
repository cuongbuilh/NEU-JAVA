package com.company;

import java.util.Scanner;

public class TaxInNYC {
    public static void main(String[] args) {
        System.out.println("enter price");
        Scanner sc = new Scanner(System.in);
        float price = sc.nextFloat();
        System.out.printf("tax: %.2f",price * 0.00825);
    }
}
