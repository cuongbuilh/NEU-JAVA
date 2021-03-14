package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 20;

        for (int i = 0; i < num; i++) {
            System.out.print(F(i) + " ");
        }
    }

    public static int F(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return F(n-1) + F(n-2);
    }
}
