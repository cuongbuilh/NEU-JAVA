package com.company;

public class GCDProgram {
    public static void main(String[] args) {
        System.out.println(GCD(6,0));
        System.out.println(GCD(15,5));
        System.out.println(GCD(99,88));
        System.out.println(GCD(3456,1233));
    }

    public static int GCD(int n1, int n2){
        if (n2 == 0) {
            return n1;
        }
        return GCD(n2, n1 % n2);
    }
}
